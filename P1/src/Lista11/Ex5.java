
package Lista11;

public class Ex5 {
	public static void main(String[] args) {
		final int numAndar = 8, numApto = 4;
		String result = "";
		int op;

		String[][] predio = new String[numAndar][numApto];

		// Indicando que o prédio começa Vago
		for (int i = 0; i < numAndar; i++) {
			for (int j = 0; j < numApto; j++) {
				predio[i][j] = "Vago";
			}
		}
		
		do {
			op = InOut.leInt("Digite a opção: \n" 
					+ "1 - Cadastrar Condômino \n" 
					+ "2 - Consultar apto \n"
					+ "3 - Consultar nome \n\n" 
					+ "0 - Encerrar o programa");

			switch (op) {
			// 1 - Cadastrar Condômino
			case 1:
				String nome = InOut.leString("Digite o nome do Condômino");
				int novoAndar = InOut.leInt("Digite o andar deste condômino");
				int novoApto = InOut.leInt("Digite o apto deste condômino");
				predio[novoAndar][novoApto] = nome;
				result = nome + " cadastrado no andar " + novoAndar + ", apto " + novoApto;
				break;
				
			// 2 - Consultar apto
			case 2:
				int andar = InOut.leInt("Digite o andar a ser consultado");
				int apto = InOut.leInt("Digite o apto a ser consultado");
				result = "Andar: " + andar + " apto: " + apto + 
						"\nMorador: " + predio[andar][apto];
				break;
			// 3 - Consultar nome
			case 3: 
				String nomeConsult = InOut.leString("Digite o nome do condômino a ser consultado");
				result = "Condômino não encontrado";
				
				// Pesquisa o condômino
				for (int i = 0; i < numAndar; i++) {
					for (int j = 0; j < numApto; j++) {
						if (predio[i][j].equalsIgnoreCase(nomeConsult)){
							result = "Condômino " + predio[i][j] +
									" morando no andar " + i +
									" apto " + j;
						}
					}
				}
				break;
			case 0:
				result = "Programa Encerrado pelo Usuário";
				break;
			default:
				result = "Entrada Inválida";
				break;
			}
			InOut.MsgDeInformação("Saída", result);
		} while (op != 0);
	}
}
