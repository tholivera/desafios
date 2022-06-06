const BuscarResultados = ({ data }) => {

    if (!data || !data.length) return null;

    const resultadoLista = data.map((id, numeroDecimal) => {
        return (
            <li key={id}>
                <span>
                    {numeroDecimal}
                </span>
            </li>
        );
    });

    return (
        <div className="buscarResultados">
            <ul>
                {resultadoLista}
            </ul>
        </div>
    )

};

export default BuscarResultados;