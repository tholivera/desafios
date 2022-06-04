package desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String[] palavra = new String[3];
		String novaPalavra;
		int aux = 0;
		int menorPalavra = 0;

		System.out.println("Por favor, digite 3 palavras");

		for (int i = 0; i < palavra.length; i++) {
			System.out.println("Digite a palavra " + (i + 1));
			palavra[i] = leia.nextLine();
		}

		int v1 = palavra[0].length();
		int v2 = palavra[1].length();
		int v3 = palavra[2].length();

		if (v1 < v2 && v1 < v3) {
			menorPalavra = v1;
		} else if (v2 < v1 && v2 < v3) {
			menorPalavra = v2;
		} else {
			menorPalavra = v3;
		}


		for (int j = 0; j < menorPalavra; j++) {

			if (palavra[0].charAt(j) == palavra[1].charAt(j) && palavra[0].charAt(j) == palavra[2].charAt(j)
					&& palavra[1].charAt(j) == palavra[2].charAt(j)) {
				aux++;
			}
		}
		
		if (aux == 0) {
			System.out.println(" ");
		} else {
			novaPalavra = palavra[0].substring(0, aux);
			System.out.println(novaPalavra);
		}

	}
	
	
}
