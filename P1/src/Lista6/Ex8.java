package Lista6;

public class Ex8 {
	public static void main(String[] args) {
		char char1 = InOut.leChar("Digite o caracter a ser adivinhado");
		char char2;
		int cont = 0;

		do {
			char2 = InOut.leChar("Tente adivinhar o primeiro "
					+ "caracter digitado");
			cont++;
		} while (char1 != char2);
		
		InOut.MsgDeInformação("Correto", "O caracter digitado era o " 
				+ char1 + " (" + cont + " tentativas)");
	}
}
