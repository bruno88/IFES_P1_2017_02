package Lista7;

public class Ex6 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 10;
		final int maxRand = 99;
		int j = 0;

		int[] vet1 = new int[tamanho];
		int[] vet2 = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vet1[i] = (int) (Math.random() * maxRand);
		}

		for (int i = 0; i < tamanho; i++) {
			if (vet1[i] % 3 == 0) {
				vet2[j] = vet1[i];
				j++;
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
