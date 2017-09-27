package Corre��oProva1.ProvaA;

import Lista4.InOut;

/*
 * Quest�o 1 - Calcular valor final de um produto 
 * com base na tabela do pa�s
 */
public class Quest�o1 {
	public static void main(String[] args) {
		final double freteUSA = 60, freteFranca = 75.5, freteMexico = 50, freteChina = 80;
		final double impostoUSA = 5.76, impostoFranca = 4.13, impostoMexico = 8.08, impostoChina = 7.1;

		double impostoUsado = 0, freteUsado = 0;
		double valorBruto = 0, valorLiquido = 0;
		int pais;

		valorBruto = InOut.leDouble("Digite o Valor Bruto do Produto: ");
		pais = InOut.leInt("Digite o c�digo do pa�s, conforme a "
				+ "lista a seguir: \n " 
				+ "1 - USA \n" 
				+ "2 - Fran�a \n"
				+ "3 - M�xico \n" 
				+ "4 - China");
		switch (pais) {
		case 1:
			freteUsado = freteUSA;
			impostoUsado = impostoUSA;
			
			break;
		case 2:
			freteUsado = freteFranca;
			impostoUsado = impostoFranca;
			break;
		case 3:
			freteUsado = freteMexico;
			impostoUsado = impostoMexico;
			break;
		case 4:
			freteUsado = freteChina;
			impostoUsado = impostoChina;
			break;
		default:
			InOut.MsgDeErro("Erro!", "C�digo de Pa�s Inv�lido!");
		}
		
		valorLiquido = valorBruto + freteUsado;
		valorLiquido *=(1 + (impostoUsado / 100));
		
		InOut.MsgDeInforma��o("Resultado", "Valor l�quido: R$" 
				+ valorLiquido);
	}

}
