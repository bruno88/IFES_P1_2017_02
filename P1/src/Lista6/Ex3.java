package Lista6;

public class Ex3 {
	public static void main(String[] args) {
		int op;
		String saida = "";

		do {
			op = InOut.leInt("Digite: \n" 
					+ "1 - Escrever \"Oi\" \n" 
					+ "2 - Escrever \"Olá\" \n"
					+ "3 - Escrever \"Tchau! \n\n " 
					+ "0 - Sair");

			switch (op) {
			case 1:
				saida = "Oi";
				break;
			case 2:
				saida = "Olá";
				break;
			case 3:
				saida = "Tchau!";
				break;
			case 0:
				InOut.MsgDeInformação("", "Programa encerrado pelo usuário!");
				System.exit(0);
			default:
				saida = "Entrada Inválida!";
			}
			InOut.MsgDeInformação("Resultado", saida);
		} while (op != 0);

	}
}
