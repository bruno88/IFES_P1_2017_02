package Lista2;

public class L02E09 {
	public static void main(String[] args) {
		int opcao;
		int num1, num2;

		opcao = InOut.leInt("Digite o c�digo da opera��o\n "
				+ "1 - Soma\n "
				+ "2 - Ra�z Quadrada\n "
				+ "0 - Finalizar");

		String saida = "O resultado da opera��o �: \n";

		// Soma
		if (opcao == 1) {
			num1 = InOut.leInt("Digite um n�mero");
			num2 = InOut.leInt("Digite um n�mero");
			int soma = num1 + num2;
			saida += "A soma �: " + soma ;
		} else if (opcao == 2) {
			num1 = InOut.leInt("Digite um n�mero");
			double raiz = Math.sqrt(num1);
			saida += "A ra�z quadrada de " + num1 + " = " + raiz;
		} else if (opcao == 0) {
			saida = "Programa encerrado pelo usu�rio!";
		} else {
			saida = "Voc� digitou um valor inv�lido!";
		}
		InOut.MsgDeInforma��o("", saida);

	}
}
