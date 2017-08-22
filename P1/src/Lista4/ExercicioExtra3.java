/*
   Crie um programa que leia o nome do usu�rio e imprima um recado, conforme abaixo:
 	1 - Bruno
 	2 - Pedro
 	3 - Maria
 	4 - Jo�o
 	5 - Joana
 	
 	As mensagens a serem exibidas s�o:
 	Para Bruno: Ter� aula Segunda, Ter�a e Sexta
 	Para Pedro: Ter� aula Quarta, Quinta e Sexta
 	Para Maria: Ter� aula Segunda, Ter�a e Quinta
 	Para Jo�o: Ter� aula Ter�a, Quarta e Quinta
 	Para Joana: Ter� aula Quarta e S�bado
 */

package Lista4;

import java.util.Scanner;

public class ExercicioExtra3 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String op = "", saida = "";

		// Menu
		String textoMenu = "Central de Recados:\n";
		textoMenu += "Digite seu nome e informaremos se h� recados\n";

		System.out.println(textoMenu);
		op = sc1.nextLine().toLowerCase();

		switch (op) {
		case "bruno":
			saida = "Ter� aula Segunda, Ter�a e Sexta";
			break;
		case "pedro":
			saida = "Ter� aula Quarta, Quinta e Sexta";
			break;
		case "maria":
			saida = "Ter� aula Segunda, Ter�a e Quinta";
			break;
		case "jo�o":
			saida = "Ter� aula Ter�a, Quarta e Quinta";
			break;
		case "joana":
			saida = "Ter� aula Quarta e S�bado";
			break;
		default:
			System.out.println("Sem recados! ");
			System.exit(0);
		}

		System.out.println(saida);

	}
}
