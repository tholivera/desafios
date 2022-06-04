package desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		int aux = aleatorio.nextInt(26);

		String input, novaLetra, novaString;
		String letraAleatoria = "abcdefghijklmnopqrstuvwxyz";

		System.out.println("Por favor, digite uma sequencia de caracteres ou palavra");
		input = leia.nextLine();

		novaLetra = letraAleatoria.substring(aux, aux + 1);

		novaString = novaLetra + input;

		List<String> embaralhar = Arrays.asList(novaString.split(""));
		Collections.shuffle(embaralhar);
		String novaOrdem = "";
		for (String letra : embaralhar) {
			novaOrdem += letra;
		}

		System.out.println("Voc� digitou: " + input);
		System.out.println("Nova sequ�ncia de caracteres: " + novaOrdem);
		System.out.println("A letra nova �: " + novaLetra);
	}
}
