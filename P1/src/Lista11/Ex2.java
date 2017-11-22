package Lista11;

public class Ex2 {
	public static void main(String[] args) {
		final int minRand = 1, maxRand = 10;

		String resultA = "", resultB = "", resultS = "", resultD = "";
		
		int linhas = InOut.leInt("Digite o numero de linhas");
		int colunas = InOut.leInt("Digite o numero de colunas");
		
		int[][] matA = new int[linhas][colunas];
		int[][] matB = new int[linhas][colunas];
		int[][] matS = new int[linhas][colunas];
		int[][] matD = new int[linhas][colunas];

		// Populando as Matrizes A e B
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matA[i][j] = (int) (Math.random() * maxRand + minRand);
				matB[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Populando as Matrizes S e D
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matS[i][j] = matA[i][j] + matB[i][j];
				matD[i][j] = matA[i][j] - matB[i][j];
			}
		}

		// Imprimindo as Matrizes
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				resultA += matA[i][j] + "\t|";
				resultB += matB[i][j] + "\t|";
				resultS += matS[i][j] + "\t|";
				resultD += matD[i][j] + "\t|";
			}
			resultA += "\n";
			resultB += "\n";
			resultS += "\n";
			resultD += "\n";
		}

		System.out.println("matA \n" + resultA);
		System.out.println("matB \n" + resultB);
		System.out.println("matS \n" + resultS);
		System.out.println("matD \n" + resultD);
	}
}
