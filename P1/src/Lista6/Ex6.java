package Lista6;

public class Ex6 {
	public static void main(String[] args) {
		int num1, num2, soma, maxRand = 100;

		do {
			num1 = (int) (Math.random() * maxRand + 1);
			num2 = (int) (Math.random() * maxRand + 1);
			soma = num1 + num2;
			InOut.MsgDeInformação("", "numeros: \n" 
					+ num1 + "\n" + num2
					+ "\nTotal = " + soma);
		} while (soma < 170);

		InOut.MsgDeInformação("Resultado",
				"Fim do programa" 
						+ "\nnum1 = " + num1 
						+ "\nnum2 = " + num2 
						+ "\nTotal = " + soma);

	}
}
