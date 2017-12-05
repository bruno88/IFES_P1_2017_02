package Lista11;

public class ExExtra2 {
	public static void main(String[] args) {
		String numSorteio, result = "", result1 = "", result2 = "", result3 = "";
		int contRepetidos = 0, auxRand, cont1 = 0, cont2 = 0, cont3 = 0;
		final int ordem = 5, minRand = 1, maxRand = 5;
		boolean continuar = true;
		
		String[] numSorteados = new String[2000];
		int posSorteados = 0;
		
		// Matriz Quadrada Ordem "ordem"
		String[][] cartela1 = new String[ordem][ordem];
		String[][] cartela2 = new String[ordem][ordem];
		String[][] cartela3 = new String[ordem][ordem];
		
		
		// Preenchendo as cartelas
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				// Preenche cartela1
				auxRand = (int) (Math.random() * maxRand + minRand);
				cartela1[i][j] = String.valueOf((auxRand)); 
				
				// Preenche cartela2
				auxRand = (int) (Math.random() * maxRand + minRand);
				cartela2[i][j] = String.valueOf((auxRand));
				
				// Preenche cartela3
				auxRand = (int) (Math.random() * maxRand + minRand);
				cartela3[i][j] = String.valueOf((auxRand));
			}
		}
		
		do {
			// Imprime cartelas
			result1 = "Cartela 1: \n";
			result2 = "Cartela 2: \n";
			result3 = "Cartela 3: \n";
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					result1 += cartela1[i][j] + " |";
					result2 += cartela2[i][j] + " |";
					result3 += cartela3[i][j] + " |";
				}
				result1 += "\n";
				result2 += "\n";
				result3 += "\n";
			}
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			result1 = "";
			result2 = "";
			result3 = "";
			
			// Passo 1: sorteia numero
			do {
				contRepetidos = 0;
				// sorteia novo numero
				auxRand = (int) (Math.random() * (ordem-1) + 0);
				numSorteio = String.valueOf((auxRand));
				
				// verifica se o número já foi sorteador
				for (int i = 0; i < posSorteados; i++) {
					// se foi sorteado, conta
					if (numSorteados[i].equals(numSorteio)) {
						contRepetidos++;
					}
				}
			// só sai daqui se o número nunca foi usado,
			// senão, volta para o início do do..while e 
			// sorteia novo número
			} while (contRepetidos != 0);
			
			// se saiu, coloca na lista de sorteados
			numSorteados[posSorteados] = numSorteio;
			posSorteados++;
			
			// Passo 2: Procurar numSorteio nas cartelas
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					if (cartela1[i][j].equals(numSorteio)){
						cartela1[i][j] = "OK";
					}
					if (cartela2[i][j].equals(numSorteio)){
						cartela2[i][j] = "OK";
					}
					if (cartela3[i][j].equals(numSorteio)){
						cartela3[i][j] = "OK";
					}
					
				}
			}
			// Passo 3.1: Procurar vitórias fixando linha
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					if (cartela1[i][j].equals("OK")) { 
						cont1++;
					}
					if (cartela2[i][j].equals("OK")) { 
						cont2++;
					}
					if (cartela3[i][j].equals("OK")) { 
						cont3++;
					}
				}
				if (cont1 == ordem) {
					result = "Cartela 1 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				if (cont2 == ordem) {
					result = "Cartela 2 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				if (cont3 == ordem) {
					result = "Cartela 3 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				cont1 = 0;
				cont2 = 0;
				cont3 = 0;
			}
			
			// TODO: Verificar se realmente está ganhando por colunas
			// Passo 3.2: Procurar vitórias procurando coluna
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					if (cartela1[j][i].equals("OK")) { 
						cont1++;
					}
					if (cartela2[j][i].equals("OK")) { 
						cont2++;
					}
					if (cartela3[j][i].equals("OK")) { 
						cont3++;
					}
				}
				if (cont1 == ordem) {
					result = "Cartela 1 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				if (cont2 == ordem) {
					result = "Cartela 2 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				if (cont3 == ordem) {
					result = "Cartela 3 vencedora";
					// Imprime vencedor
					System.out.println(result);
					System.exit(1);
				}
				cont1 = 0;
				cont2 = 0;
				cont3 = 0;
			}
		} while (continuar);
		
		

	}
}
