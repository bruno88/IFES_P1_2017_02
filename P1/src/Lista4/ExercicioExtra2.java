/*
   Implemente uma calculadora que exiba o menu abaixo:
 	1 - Somar
	2 - Subtrair
	3 - Multiplicar
	4 - Dividir
	
	Ap�s ler a op��o do usu�rio e fazendo uso do Switch Case, receba dois 
	n�meros e retorne o resultado da opera��o, com base no operador 
	escolhido pelo usu�rio  
 */

package Lista4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ExercicioExtra2 {
	public static void main(String[] args) {
		int num1, num2;
		String op = "", saida = "";
		Scanner sc1 = new Scanner(System.in);

		// Menu
		String textoMenu = "Escolha uma op��o: ";
		textoMenu += "\n+ para Somar";
		textoMenu += "\n- para Subtrair";
		textoMenu += "\n* para Multiplicar";
		textoMenu += "\n/ para Dividir";

		// op = InOut.leString(textoMenu);
		System.out.println(textoMenu);
		op = sc1.nextLine();

		System.out.println("Digite o 1� n�mero");
		num1 = sc1.nextInt();

		System.out.println("Digite o 2� n�mero");
		num2 = sc1.nextInt();

		switch (op) {
		case "+":
			// saida = "" + (num1 + num2);
			saida = String.valueOf(num1 + num2);
			break;
		case "-":
			saida = String.valueOf(num1 - num2);
			break;
		case "*":
			saida = String.valueOf(num1 * num2);
			break;
		case "/":
			saida = String.valueOf(num1 / num2);
			break;
		default:
			System.out.println("Valor inv�lido!");
			System.exit(0);
		}

		System.out.println(saida);

	}
}
