package Lista7;

public class Ex5 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 10;
		final int maxRand = 99;

		int[] vet1 = new int[tamanho];
		int[] vet2 = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vet1[i] = (int) (Math.random() * maxRand);
		}

		for (int i = 0; i < tamanho; i++) {
			if (vet1[i] % 3 == 0) {
				vet2[i] = vet1[i];
			} else {
				vet2[i] = 0;
			}
		}

		// Imprimindo vet1
		saida = "";
		for (int i = 0; i < tamanho; i++) {
			saida += vet1[i] + " ";
		}
		System.out.println("Vet1 = " + saida);

		// Imprimindo vet2
		saida = "";
		for (int i = 0; i < tamanho; i++) {
			saida += vet2[i] + " ";
		}
		System.out.println("Vet2 = " + saida);
	}
}
