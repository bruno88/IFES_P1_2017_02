package Lista4;

import java.util.Scanner;

/**
 * 1 - Imprime 1 2 - Imprime 2 0 - Encerra programa Qualquer outra coisa: repete
 * o menu
 */
public class ExercicioExtra7 {

	public static void main(String[] args) {
		String saida = "";
		int op;
		System.out.println("Digite dia da Semana:");
		
		op = new Scanner(System.in).nextInt();
		switch (op) {
		case 1:
			saida = "Domingo";
			break;
		case 0:
			saida = "Domingo";
		default:
			saida = "Domingo";
		}

		System.out.println(saida);

	}
}
