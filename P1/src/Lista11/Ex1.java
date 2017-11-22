package Lista11;

public class Ex1 {
	public static void main(String[] args) {
		final int linhas = 8, colunas = 8;

		String result = "";

		String[][] matriz = new String[linhas][colunas];

		// Populando a Matriz
		/*for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				// Modo 1
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						matriz[i][j] = "░░";
					} else {
						matriz[i][j] = "██";
					}
				} else {
					if (j % 2 == 0) {
						matriz[i][j] = "██";
					} else {
						matriz[i][j] = "░░";
					}
				}
			}
		}*/
		// Modo 2
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (i % 2 != j % 2) {
					matriz[i][j] = "██";
				} else {
					matriz[i][j] = "░░";
				}
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				result += matriz[i][j];
			}
			result += "\n";
		}

		System.out.println(result);
	}
}
