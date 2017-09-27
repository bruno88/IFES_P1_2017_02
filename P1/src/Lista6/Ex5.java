package Lista6;

public class Ex5 {
	public static void main(String[] args) {
		int num1, num2, produto;

		do {
			num1 = InOut.leInt("Digite um número");
			num2 = InOut.leInt("Digite outro número");
			produto = num1 * num2;
		} while (produto >= 10  && produto <= 1000);

		InOut.MsgDeInformação("Resultado", "Fim do programa" 
		+ "\nnum1 = " + num1 
		+ "\nnum2 = " + num2 
		+ "\nTotal = " + produto);

	}
}
