package CorreçãoProva1.ProvaA;

import Lista4.InOut;

/*
 * Questão 1 - Calcular valor final de um produto 
 * com base na tabela do país
 */
public class Questão1 {
	public static void main(String[] args) {
		final double freteUSA = 60, freteFranca = 75.5, freteMexico = 50, freteChina = 80;
		final double impostoUSA = 5.76, impostoFranca = 4.13, impostoMexico = 8.08, impostoChina = 7.1;

		double impostoUsado = 0, freteUsado = 0;
		double valorBruto = 0, valorLiquido = 0;
		int pais;

		valorBruto = InOut.leDouble("Digite o Valor Bruto do Produto: ");
		pais = InOut.leInt("Digite o código do país, conforme a "
				+ "lista a seguir: \n " 
				+ "1 - USA \n" 
				+ "2 - França \n"
				+ "3 - México \n" 
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
			InOut.MsgDeErro("Erro!", "Código de País Inválido!");
		}
		
		valorLiquido = valorBruto + freteUsado;
		valorLiquido *=(1 + (impostoUsado / 100));
		
		InOut.MsgDeInformação("Resultado", "Valor líquido: R$" 
				+ valorLiquido);
	}

}
