package Lista7;

public class Ex3 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 7;
		final int maxRand = 9;
		int[] vet1 = new int[tamanho];
		int[] vet2 = new int[tamanho];

		// Bora achar o erro?
		// Populando o primeiro vetor
		for (int i = 0; i < tamanho; i++) {
			vet1[i] = (int) (Math.random() * maxRand);
			vet2[i] = (int) Math.random() * maxRand;
		}

		// Imprimindo vet1
		for (int i = 0; i < vet1.length; i++) {
			saida += vet1[i] + "\n";
		}
		InOut.MsgDeInformação("Todos", saida);
		
		// Imprimindo vet2
		saida = "";
		for (int i = 0; i < vet2.length; i++) {
			saida += vet2[i] + "\n";
		}
		InOut.MsgDeInformação("Todos", saida);
	}
}
