package Lista4;

import java.util.Scanner;

/**
 * Fa�a um programa que receba um dia da semana (de 1 a 7) e retorne o nome do
 * dia, sendo que 1 = Domingo e 7 = S�bado Em seguida, fa�a o oposto.
 */
public class ExercicioExtra6 {

	public static void main(String[] args) {
		int diaSemana;

		String saida = "", nomeDoDia = "";

		System.out.println("Digite dia da Semana:");
		diaSemana = new Scanner(System.in).nextInt();

		switch (diaSemana) {

		case 1:
			saida = "Domingo";
			break;
		case 2:
			saida = "Segunda";
			break;
		case 3:
			saida = "Ter�a";
			break;
		case 4:
			saida = "Quarta";
			break;
		case 5:
			saida = "Quinta";
			break;
		case 6:
			saida = "Sexta";
			break;
		case 7:
			saida = "S�bado";
			break;
		default:
			System.out.println("Entrada Inv�lida! ");
			System.exit(0);
		}
		System.out.println("O dia digitado �: " + saida);

		// Segunda etapa: Recebe o nome do dia e retorna o numero
		System.out.println("\nDigite o nome do dia a ser consultado");
		nomeDoDia = new Scanner(System.in).nextLine().toLowerCase();

		switch (nomeDoDia) {

		case "domingo":
			saida = "" + 1;
			// saida = String.valueOf(1);
			break;
		case "segunda":
			saida = String.valueOf(2);
			break;
		case "ter�a":
			saida = String.valueOf(3);
			break;
		case "quarta":
			saida = String.valueOf(4);
			break;
		case "quinta":
			saida = String.valueOf(5);
			break;
		case "sexta":
			saida = String.valueOf(6);
			break;
		case "sabado":
			saida = String.valueOf(7);
			break;
		default:
			System.out.println("Entrada Inv�lida! ");
			System.exit(0);
		}
		System.out.println("O dia de semana digitado �: " + saida + "� dia da semana!");

	}
}
