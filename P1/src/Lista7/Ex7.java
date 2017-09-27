package Lista7;

public class Ex7 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 10;
		final int maxRand = 9;

		int[] vet1 = new int[tamanho];

		// Popula o vetor com as notas
		for (int i = 0; i < tamanho; i++) {
			vet1[i] = (int) (Math.random() * maxRand + 1);
		}

		for (int i = 0; i < tamanho; i++) {
			if (vet1[i] > 6) {
				saida += "Nota: " + vet1[i] + " (APROVADO)\n";
			} else {
				saida += "Nota: " + vet1[i] + " (PROVA FINAL)\n";
			}
		}
		
		// Imprimindo vet1
		System.out.println("Vet1 = \n " + saida);

	}
}
