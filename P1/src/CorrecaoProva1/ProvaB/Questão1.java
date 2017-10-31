package CorrecaoProva1.ProvaB;

import Lista2.InOut;

/*
 * 1 - Ler 3 int e realizar opera��es 
 */
public class Quest�o1 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, op;
		String saida = "";

		op = InOut.leInt("Digite a op��o desejada:\n"
				+ "1 - Raiz Quadrada\n"
				+ "2 - Menores que 30\n"
				+ "3 - Imprimir express�o\n"
				+ "4 - Express�o par ou impar\n\n"
				+ "0 - Encerrar o programa");

		if (op == 1 || op == 2 || op == 3 || op == 4) {
			num1 = InOut.leInt("Digite o primeiro n�mero.");
			num2 = InOut.leInt("Digite o segundo n�mero.");
			num3 = InOut.leInt("Digite o terceiro n�mero.");
		}
		
		switch (op) {
		case 1:
			saida = "Ra�z Quadrada: \n" 
					+ num1 + " = " + Math.sqrt(num1) + "\n" 
					+ num2 + " = " + Math.sqrt(num2) + "\n"
					+ num3 + " = " + Math.sqrt(num3);
			break;
		case 2:
			saida = "N�meros menores que 30:\n";
			if (num1 < 30) {
				saida += num1 + "\n";
			}
			
			if (num2 < 30) {
				saida += num2 + "\n";
			}
			
			if (num3 < 30) {
				saida += num3 + "\n";
			}
			
			break;
		case 3:
			double media = (num1 + num2 + num3) / 3;
			saida = "Express�o da M�dia Aritm�tica:\n (" 
					+ num1 + " + " 
					+ num2 + " + " 
					+ num3 + ") / 3 = " + media;
			break;
		case 4:
			double resultado = (num1 + num2) / num3;
			
				saida = "O resultado da conta � : " + resultado;
				if (resultado % 2 == 0) {
					saida += "\n Esse valor � PAR";
				} else {
					saida += "\n Esse valor � �MPAR";
				}
			
			break;
		case 0:
			InOut.MsgDeInforma��o("Fim do Programa", "Programa encerrado por comando do usu�rio");
			System.exit(0);
		default:
			InOut.MsgDeErro("Erro", "Op��o Inv�lida!");
		}
		InOut.MsgDeInforma��o("Resultado", saida);
	}

}
