package Lista1;
/* 01 -  Fa�a um algoritmo que receba o sal�rio-base de um funcion�rio,
 * calcule e mostre o sal�rio a receber, sabendo-se que esse funcion�rio
 * tem gratifica��o de 5% sobre o sal�rio-base e paga imposto de 7%
 * sobre o total.
 */

public class L01E01 {
	public static void main(String[] args) {		
		final double gratificacao = 0.05;
		final double imposto = 0.07;

		double salBase, salLiquido;

		salBase = InOut.leDouble("Informe o valor do seu sal�rio base");
		salLiquido = (salBase + (salBase * gratificacao)) * (1 - imposto);
		InOut.MsgDeInforma��o("", "O salario liquido de R$" + salLiquido);

	}
}
