package Lista9;

public class Ex6 {
	public static void main(String[] args) {
		String result = "";
		final int tam = 10;
		int menorOrdenado = 0, menorVet1 = 0, menorVet2 = 0;

		int[] vet1 = { 7, 3, 5, 1 };
		int[] vet2 = { 10, 4, 12, 12, 2, 6 };
		int[] ordenado = new int[tam];

		for (int i = 0; i < ordenado.length; i++) {
			// Busca o menor número deste vetor,
			// que seja maior que o menor ordenado
			menorVet1 = 99;
			for (int j = 0; j < vet1.length; j++) {
				if (vet1[j] < menorVet1 && vet1[j] > menorOrdenado) {
					menorVet1 = vet1[j];
				}
			}
			
			// Busca o menor número deste vetor,
			// que seja maior que o menor ordenado			
			menorVet2 = 99;
			for (int j = 0; j < vet2.length; j++) {
				if (vet2[j] < menorVet2 && vet2[j] > menorOrdenado) {
					menorVet2 = vet2[j];
				}
			}
			
			// Atualiza o vetor com o menor número encontrado
			if (menorVet1 < menorVet2) {
				ordenado[i] = menorVet1;
				menorOrdenado = menorVet1;
			} else {
				ordenado[i] = menorVet2;
				menorOrdenado = menorVet2;
			}
		}

		// Imprime o vetor de ordenados
		for (int i = 0; i < ordenado.length; i++) {
			result += ordenado[i] + "\n";
		}
		InOut.MsgDeInformação("", result);
	}
}
