package Lista2;
// Fa�a um Programa que receba dois n�meros e imprima o menor dos dois.

public class L02E06 {
	public static void main(String[] args) {
		int num1, num2;

		num1 = InOut.leInt("Digite o primeiro n�mero");
		num2 = InOut.leInt("Digite o segundo n�mero");

		if (num1 > num2) {
			InOut.MsgDeInforma��o("", "O primeiro n�mero (" + num1 + ") � maior que o segundo n�mero (" + num2 + ")");
		} else {
			InOut.MsgDeInforma��o("", "O segundo n�mero (" + num2 + ") � maior que o primeiro n�mero (" + num1 + ")");
		}

	}
}
