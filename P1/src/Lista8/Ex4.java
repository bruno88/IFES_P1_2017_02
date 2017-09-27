package Lista8;

public class Ex4 {
	public static void main(String[] args) {
		String result = "";
		final int maxRand = 99, tamanho = 5;
		int j;

		int[] vetorOriginal = new int[tamanho];
		int[] vetorImpares = new int[tamanho];
		int[] vetorPares = new int[tamanho];
		int[] vetorMult3 = new int[tamanho];
		int[] vetorMult10 = new int[tamanho];

		// Popula o vetor
		for (int i = 0; i < vetorOriginal.length; i++) {
			vetorOriginal[i] = (int) (Math.random() * maxRand + 1);
			result += vetorOriginal[i] + " ";
		}
		// Imprimindo vetor (PARA TESTES)
		InOut.MsgDeInformação("", "Vetor completo: " + result);

		// Impares
		result = "";
		j = 0;
		for (int i = 0; i < vetorImpares.length; i++) {
			if (vetorOriginal[i] % 2 != 0) {
				vetorImpares[j] = vetorOriginal[i];
				result += vetorImpares[j] + " ";
				j++;

			}
		}

		// Imprimindo vetor (PARA TESTES)
		InOut.MsgDeInformação("", "Vetor Impares: " + result);

		// Pares
		result = "";
		j = 0;
		for (int i = 0; i < vetorPares.length; i++) {
			if (vetorOriginal[i] % 2 == 0) {
				vetorPares[j] = vetorOriginal[i];
				result += vetorPares[j] + " ";
				j++;

			}
		}
		// Imprimindo vetor (PARA TESTES)
		InOut.MsgDeInformação("", "Vetor pares: " + result);

		// Multiplos de 3
		result = "";
		j = 0;
		for (int i = 0; i < vetorMult3.length; i++) {
			if (vetorOriginal[i] % 3 == 0) {
				vetorMult3[j] = vetorOriginal[i];
				result += vetorMult3[j] + " ";
				j++;
			}
		}

		// Imprimindo vetor (PARA TESTES)
		InOut.MsgDeInformação("", "Vetor Mult3: " + result);

		// Multiplos de 10
		result = "";
		j = 0;
		for (int i = 0; i < vetorMult10.length; i++) {
			if (vetorOriginal[i] % 10 == 0) {
				vetorMult10[j] = vetorOriginal[i];
				result += vetorMult10[j] + " ";
				j++;
			}
		}

		// Imprimindo vetor (PARA TESTES)
		InOut.MsgDeInformação("", "Vetor Mult10: " + result);

	}
}