package Lista11;

public class Ex6 {
	public static void main(String[] args) {
		final int minRand = 1, maxRand = 50;
		int posAtual = 0;
		String result = "";

		int linhas = InOut.leInt("Digite o numero de linhas");
		int colunas = InOut.leInt("Digite o numero de colunas");

		int[][] matriz = new int[linhas][colunas];
		int[] multiplos = new int[linhas * colunas];

		// Populando a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				result += matriz[i][j] + " | ";
			}
			result += "\n";
		}

		System.out.println(result);
		result = "";
		
		int multiplo = InOut.leInt("Digite o número a ter " + 
					" os múltiplos consultados");

		// Buscando os multiplos 
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] % multiplo == 0) {
					multiplos[posAtual] = matriz[i][j];
					posAtual++;
				}
			}
		}

		// Imprimindo os Multiplos
		for (int i = 0; i < posAtual; i++) {
			result += multiplos[i] + ", ";

		}

		System.out.println("Múltiplos: \n" + result);
	}
}
