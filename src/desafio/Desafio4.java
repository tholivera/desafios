package desafio;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero, aux = 0, soma = 0;

		boolean feliz = false;

		System.out.println("Digite um número e descubra se ele é feliz :)");
		numero = leia.nextInt();

		String numString = Integer.toString(numero);
		char[] numArray = numString.toCharArray();
		int[] numInteiro = new int[numArray.length];
		int[] potencia = new int[numInteiro.length];

		if (numero > 1) {

			for (int i = 0; i < numArray.length; i++) {
				numInteiro[i] = numArray[i] - 48;
			}

			for (int i = 0; i < numInteiro.length; i++) {
				potencia[i] = (int) Math.pow(numInteiro[i], 2);
			}

			for (int i = 0; i < potencia.length; i++) {
				soma += potencia[i];
			}

			if (soma > 1) {
				while (soma != 1 && aux < 11) {
					String quadradoString = Double.toString(soma);
					char[] quadradoArray = quadradoString.toCharArray();
					int[] quadradoInteiro = new int[quadradoArray.length];
					int[] potenciaDois = new int[quadradoInteiro.length];

					for (int i = 0; i < quadradoArray.length; i++) {

						if ((quadradoArray[i] - 48) <= 0) {
							break;
						} else {
							quadradoInteiro[i] = quadradoArray[i] - 48;
						}
					}

					for (int i = 0; i < quadradoInteiro.length; i++) {
						potenciaDois[i] = (int) Math.pow(quadradoInteiro[i], 2);
					}

					soma = 0;
					for (int i = 0; i < potenciaDois.length; i++) {
						soma += potenciaDois[i];
					}
					aux++;
				}

				if (aux > 10) {
					System.out.println("Looping infinito!");

				} else if (soma == 1) {
					
					feliz = true;
					System.out.println(feliz);
				}

			} else if (numero == 1 || soma == 1) {
				
				feliz = true;
				System.out.println(feliz);
			}
		} else {

			System.out.println("Número inválido!");

		}

	}
}