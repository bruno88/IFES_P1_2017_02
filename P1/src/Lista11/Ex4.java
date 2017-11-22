
package Lista11;

public class Ex4 {
	public static void main(String[] args) {
		final int linhas = 3, colunas = 3;
		int proxJogador = 1, jogadorAtual = 1, novaLinha, novaColuna;
		String result = "";
		boolean continuar = true;

		String[][] tabuleiro = new String[linhas][colunas];

		// Preenche toda a matriz com "_"
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				tabuleiro[i][j] = "_";
			}
		}

		do {
			// Imprime tabuleiro
			result = "";
			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; j++) {
					result += tabuleiro[i][j] + " | ";
				}
				result += "\n";
			}
			System.out.println(result);
			result = "";

			// Lê dados do usuário
			novaLinha = InOut.leInt("Digite a linha a ser jogada");
			novaColuna = InOut.leInt("Digite a coluna a ser jogada");

			// Verificando se a tupla é valida e está livre
			if (novaLinha >= 0 && 
					novaLinha < linhas && 
					novaColuna >= 0 && 
					novaColuna < colunas &&
					tabuleiro[novaLinha][novaColuna] == "_") {
				// Registra a jogada de acordo com o jogador
				if (proxJogador == 1) {
					tabuleiro[novaLinha][novaColuna] = "O";
					proxJogador = 2;
					jogadorAtual = 1;
				} else {
					tabuleiro[novaLinha][novaColuna] = "X";
					proxJogador = 1;
					jogadorAtual = 2;
				}

				// Checando vitória
				for (int i = 0; i < linhas; i++) {
					// Checando as Colunas
					if (tabuleiro[i][0].equals(tabuleiro[i][1]) && 
							tabuleiro[i][0].equals(tabuleiro[i][2])
							&& !tabuleiro[i][0].equals("_")) {
						result = "Vitória do jogador " + jogadorAtual;
						continuar = false;
					}
					// Checando as Linhas
					if (tabuleiro[0][i].equals(tabuleiro[1][i]) && 
							tabuleiro[0][i].equals(tabuleiro[2][i])
							&& !tabuleiro[0][i].equals("_")) {
						result = "Vitória do jogador " + jogadorAtual;
						continuar = false;
					}

					// Verificando a Diagonal Principal
					if (tabuleiro[0][0].equals(tabuleiro[1][1]) && 
							tabuleiro[0][0].equals(tabuleiro[2][2]) &&
							!tabuleiro[0][0].equals("_")) {
						result = "Vitória do jogador " + jogadorAtual;
						continuar = false;
					}
					
					// Verificando a Diagonal Invertida
					if (tabuleiro[0][2].equals(tabuleiro[1][1]) && 
							tabuleiro[0][2].equals(tabuleiro[2][0]) &&
							!tabuleiro[0][2].equals("_")) {
						result = "Vitória do jogador " + jogadorAtual;
						continuar = false;
					}
				}
			} else {
				result = "Jogada Inválida";
			}

			System.out.println(result);
		} while (continuar);

		// Imprime tabuleiro final
		result = "";
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				result += tabuleiro[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);

	}
}
