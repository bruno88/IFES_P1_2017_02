package Lista6;

public class Ex4 {
	public static void main(String[] args) {
		int num, fatorial = 1;

		num = InOut.leInt("Digite um n�mero");

		while (num >= 1) {
			fatorial *= num;
			num--;
		}
		InOut.MsgDeInforma��o("Resultado", "" + fatorial);

	}
}
