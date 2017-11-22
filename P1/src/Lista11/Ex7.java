package Lista11;

public class Ex7 {
	public static void main(String[] args) {
		final int minRand = 1, maxRand = 50, ordem = 5;
		String result = "";

		int[][] matriz = new int[ordem][ordem];
		String[][] matString = new String[ordem][ordem];

		// Preenchendo e imprimindo matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
				result += matriz[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);
		result = "";
		
		// Populando Matriz String
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if ((i + j) == (ordem-1)) {
					matString[i][j] = String.valueOf(matriz[i][j]); 
				} else {
					matString[i][j] = "██";
				}

			}
		}
		
		// Imprime Mat Str
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matString[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);
	}
}
