package Lista7;

public class Ex4 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 5;
		int[] vet1 = new int[tamanho];
		int[] vet2 = new int[tamanho];

		// Lê 5 int
		for (int i = 0; i < tamanho; i++) {
			vet1[i] = InOut.leInt("Digite um Número Inteiro");
		}

		// Calculando vet2
		for (int i = 0; i < tamanho; i++) {
			vet2[i] = vet1[i] * 2;
		}

		// Imprimindo vet1
		saida = "";
		for (int i = 0; i < tamanho; i++) {
			saida += vet1[i] + "\n";
		}
		InOut.MsgDeInformação("Vetor 1", saida);

		// Imprimindo vet2
		saida = "";
		for (int i = 0; i < tamanho; i++) {
			saida += vet2[i] + "\n";
		}
		InOut.MsgDeInformação("Vetor 2", saida);
	}
}
