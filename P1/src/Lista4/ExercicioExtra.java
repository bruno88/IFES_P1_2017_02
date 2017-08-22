/*
   Fazendo uso do Switch Case, fa�a um programa que exiba o menu abaixo:
 	1 - Imprimir n�meros
	2 - Imprimir letras
	3 - Imprimir pontua��o
	
	Ao selecionar uma dessas op��es, elas devem trazer seu menu correspondente:
	1 - Imprimir n�meros
		1 - Imprimir 1
		2 - Imprimir 2
		3 - Imprimir 3
		
	2 - Imprimir letras
		1 - Imprimir A
		2 - Imprimir B
		3 - Imprimir C
		
	3 - Imprimir pontua��o
		1 - Imprimir ,
		2 - Imprimir .
		3 - Imprimir ;
		
	Imprimir em tela o n�mero, letra ou caracter referente � op��o escolhida
 */

package Lista4;

public class ExercicioExtra {
	public static void main(String[] args) {
		double total = 0;
		int op;
		String saida = "";

		// Menu
		String textoMenu = "Escolha uma op��o: ";
		textoMenu += "\n1 - Imprimir n�meros";
		textoMenu += "\n2 - Imprimir letras";
		textoMenu += "\n3 - Imprimir pontua��o";

		op = InOut.leInt(textoMenu);

		switch (op) {
		case 1:
			textoMenu = "Voc� escolheu 'Imprimir N�meros'. Escolha uma nova op��o: ";
			textoMenu += "\n1 - Imprimir 1";
			textoMenu += "\n2 - Imprimir 2";
			textoMenu += "\n3 - Imprimir 3";

			op = InOut.leInt(textoMenu);
			switch (op) {
			case 1:
				saida = "1";
				break;
			case 2:
				saida = "2";
				break;
			case 3:
				saida = "3";
				break;
			default:
				InOut.MsgDeInforma��o("", "Valor inv�lido! ");
				System.exit(0);
			}
			break;
		case 2:
			textoMenu = "Voc� escolheu 'Imprimir Letras'. Escolha uma nova op��o: ";
			textoMenu += "\n1 - Imprimir A";
			textoMenu += "\n2 - Imprimir B";
			textoMenu += "\n3 - Imprimir C";

			op = InOut.leInt(textoMenu);
			switch (op) {
			case 1:
				saida = "A";
				break;
			case 2:
				saida = "B";
				break;
			case 3:
				saida = "C";
				break;
			default:
				InOut.MsgDeInforma��o("", "Valor inv�lido! ");
				System.exit(0);
			}
			break;
		case 3:
			textoMenu = "Voc� escolheu 'Imprimir Pontua��o'. Escolha uma nova op��o: ";
			textoMenu += "\n1 - Imprimir ,";
			textoMenu += "\n2 - Imprimir .";
			textoMenu += "\n3 - Imprimir ;";

			op = InOut.leInt(textoMenu);
			switch (op) {
			case 1:
				saida = ",";
				break;
			case 2:
				saida = ".";
				break;
			case 3:
				saida = ";";
				break;
			default:
				InOut.MsgDeInforma��o("", "Valor inv�lido! ");
				System.exit(0);
			}
			break;
		default:
			InOut.MsgDeInforma��o("", "Valor inv�lido! ");
			System.exit(0);
		}

		InOut.MsgDeInforma��o("", saida);

	}
}
