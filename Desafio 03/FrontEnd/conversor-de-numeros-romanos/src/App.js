import './App.css';
import { useState } from 'react';
import BuscarResultados from './components/BuscarResultados';

function App() {

  const [data, setData] = useState([]);


  const handleInputChange = (e) => {
    e.preventDefault();
    const { value } = e.target;

    if (!value) return;

    const url = `http://localhost:8080/numeros/numeros/${value}`;

    fetch(url)
      .then((response) => response.json())
      .then(([data]) => setData (data));

  }
  console.log('Dados', data)
  return (
    <div className="container">
      <form>
        <label htmlFor="buscar" >DIGITE O NÚMERO A SER CONVERTIDO
          <input name="buscar" id="buscar" onChange={handleInputChange} />
        </label>
      </form>
      <div>
        <BuscarResultados data={data}/>
      </div>
      
    </div>
  );
}

export default App;
