package Lista11;

public class ExExtra1 {
	public static void main(String[] args) {
		
		String result = "";
		int op = 0;
		
		int ordem = InOut.leInt("Digite a ordem da matriz");
		
		int X1, X2, Y1, Y2, num;
		
		// Matriz Quadrada Ordem "ordem"
		int[][] mat = new int[ordem][ordem];
		
		// Definindo o intervalo dos números aleatórios
		int minRand = InOut.leInt("Digite o menor número possível");
		int maxRand = InOut.leInt("Digite o maior número possível");
		
		// Preenchendo a matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				mat[i][j] = (int) (minRand + 
						(Math.random() * 
						(maxRand - minRand + 1))); 
			}
		}
		
		do {
			
			// Imprimindo a Matriz
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					result += mat[i][j] + " |";
				}
				result += "\n";
			}
			System.out.println(result);
			result = "";
			
			// Lê a entrada do usuário
			op = InOut.leInt("Digite a opção: \n"
					+ "1 - Alterar valor aleatório \n"
					+ "2 - Inverter posições \n"
					+ "3 - Zerar 3 aleatórios \n"
					+ "4 - Inverter diagonais \n\n"
					+ "0 - Encerrar o programa");
			
			switch (op) {
			
			// 1 - Alterar valor aleatório
			case 1:
				X1 = (int) (Math.random() * (ordem-1) + 0);
				Y1 = (int) (Math.random() * (ordem-1) + 0);
				num = InOut.leInt("Digite o número a ser inserido");
				mat[X1][Y1] = num;
				result = num + " sobreposto com sucesso! \n";
				break;
				
			// 2 - Inverter posições
			case 2:
				X1 = (int) (Math.random() * (ordem-1) + 0);
				Y1 = (int) (Math.random() * (ordem-1) + 0);
				X2 = (int) (Math.random() * (ordem-1) + 0);
				Y2 = (int) (Math.random() * (ordem-1) + 0);
				
				// Realiza inversão
				num = mat[X1][Y1];
				mat[X1][Y1] = mat[X2][Y2];
				mat[X2][Y2] = num;
				
				result = "(" + X1 + "," + Y1 + ") invertido com"
						+ "(" + X2 + "," + Y2 + ") \n";
				break;
				
			// 3 - Zerar 3 aleatórios
			case 3:
				int cont = 3;
				while (cont > 0) {
					X1 = (int) (Math.random() * (ordem-1) + 0);
					Y1 = (int) (Math.random() * (ordem-1) + 0);
					mat[X1][Y1] = 0;
					cont--;
				}
				result = "valores zerados com sucesso! \n";
				break;
				
			// 4 - Inverter diagonais
			case 4:
				for (int i = 0; i < ordem; i++) {
					for (int j = 0; j < ordem; j++) {
						// Se o termo está na diagonal principal
						if (i == j) {
							// Obtém a coluna em função da linha
							int colSecundaria = (ordem - 1 - j);
							// Faz a inversão
							num = mat[i][j];
							mat[i][j] = mat[i][colSecundaria];
							mat[i][colSecundaria] = num;
						}
					}
				}
				result = "inversão realizada com sucesso! \n";

				break;
				
			// 0 - Encerrar o programa
			case 0:
				result = "Programa encerrado pelo usuário";
				break;

			default:
				result = "Opção Inválida";
				break;
			}
			
			System.out.println(result);
			result = "";
			
		} while (op != 0);

	}
}
