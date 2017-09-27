package CorreçãoProva1.ProvaA;

import Lista4.InOut;

public class Questão2 {

	public static void main(String[] args) {
		int numA = 0, numB = 0, numC = 0;
		numA = InOut.leInt("Digite o valor de A");
		numB = InOut.leInt("Digite o valor de B");
		
		/*if (numB >= 0) {
			InOut.MsgDeErro("Erro!", "Raiz quadrada de número negativo!");
			System.exit(0);
		}*/
		
		numC = InOut.leInt("Digite o valor de C");
		
		/*numA = 10;
		numB = -10;
		numC = 10;*/
		
		double subexpressao = (-1 * numB) / Math.pow(numC, 2);

		if (subexpressao < 0) {
			InOut.MsgDeErro("Erro", "Raiz quadrada de número negativo!");
		}
		
		double expressao = (4 * numA) - Math.sqrt(subexpressao); 

		InOut.MsgDeInformação("Resultado", "O valor de X para a " 
				+ "expressão, quando: \n" 
				+ "A = " + numA + " \n"
				+ "B = " + numB + " \n" 
				+ "C = " + numC + " \n"
				+ "Resultado = " + expressao);


	}

}
