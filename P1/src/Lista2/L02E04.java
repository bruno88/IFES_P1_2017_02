package Lista2;
/* Fa�a uma Programa que receba a idade de uma pessoa e imprima 
 * mensagem de maioridade ou n�o */

public class L02E04 {
	public static void main(String[] args) {
		int idade;

		idade = InOut.leInt("Informe a sua idade");

		if (idade < 18) {
			InOut.MsgDeInforma��o("", "Voc� � menor de idade");
		} else
			InOut.MsgDeInforma��o("", "Voc� � maior de idade");
	}
}
