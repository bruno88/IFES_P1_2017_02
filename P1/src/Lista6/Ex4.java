package Lista6;

public class Ex4 {
	public static void main(String[] args) {
		int num, fatorial = 1;

		num = InOut.leInt("Digite um número");

		while (num >= 1) {
			fatorial *= num;
			num--;
		}
		InOut.MsgDeInformação("Resultado", "" + fatorial);

	}
}
