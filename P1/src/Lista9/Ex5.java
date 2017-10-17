package Lista9;

public class Ex5 {
	public static void main(String[] args) {
		String result = "";
		final int tam = 5, minRand = 1, maxRand = 10;
		int posAtual = 0;
		boolean jaExiste = false;
		
		/*int[] vet1 = new int[tam];
		int[] vet2 = new int[tam];*/
		int[] vet1 = { 1, 2, 3, 4, 5 };
		int[] vet2 = { 3, 8, 4, 4, 5 };
		int[] intersecao = new int[tam];

		// Popula o vetor
		/*for (int i = 0; i < vet1.length; i++) {
			vet1[i] = (int) (minRand + (Math.random() * maxRand));
			vet2[i] = (int) (minRand + (Math.random() * maxRand));
		}*/
		
		// Interseção
		for (int i = 0; i < vet1.length; i++) {
			for (int j = 0; j < vet2.length; j++) {
				if (vet1[i] == vet2[j]) {
					jaExiste = false;
					for (int k = 0; k < posAtual; k++) {
						if (intersecao[k] == vet1[i]) {
							jaExiste = true;
						}
					}
					if (!jaExiste) {
						intersecao[posAtual] = vet1[i];
						posAtual++;
					}
				}
			}
		}

		for (int i = 0; i < posAtual; i++) {
			result += intersecao[i] + "\n";
		}
		InOut.MsgDeInformação("", result);

	}
}
