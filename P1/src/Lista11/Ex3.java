package Lista11;

public class Ex3 {
	public static void main(String[] args) {
		final int linhas = 4, colunas = 3, minRand = 1, maxRand = 50;

		String result = "";

		int[][] mat = new int[linhas][colunas];
		int[][] matT = new int[colunas][linhas];

		// Populando a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mat[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Preenchendo matriz transposta
		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				matT[i][j] = mat[j][i];
			}
		}

		// Imprimindo a Matriz original
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				result += mat[i][j] + "\t|";

			}
			result += "\n";

		}
		System.out.println(result);
		result = "";
		
		// Imprimindo a Matriz transposta
		for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				result += matT[i][j] + "\t|";

			}
			result += "\n";

		}

		System.out.println(result);
	}
}
