package Lista2;
/* Uma empresa decide dar um aumento de 30% aos funcion�rios cujo sal�rio 
 * � inferior a 500 reais. Escreva uma Programa que receba o sal�rio 
 * de um funcion�rio e imprima o valor do sal�rio reajustado ou 
 * uma mensagem caso o funcion�rio n�o tenha direito ao aumento. 
 */

public class L02E03 {
	public static void main(String[] args) {
		double salarioBruto;
		final double criterioSal = 500;
		final double ajuste = 0.3;

		salarioBruto = InOut.leDouble("Informe o sal�rio bruto do funcion�rio");

		if (salarioBruto <= criterioSal) {
			InOut.MsgDeInforma��o("", "O funcion�rio receber� um ajuste de 30% " + "e o novo valor ser� de : "
					+ salarioBruto * (1 + ajuste));
		} else
			InOut.MsgDeInforma��o("",
					"O funcion�rio n�o receber� ajustes. O novo valor ser� de : " + salarioBruto);

	}
}
