package Lista7;

public class Ex2 {
	public static void main(String[] args) {
		String saida = "";
		final int tamanho = 5;
		int[] vetor = new int[tamanho];

		// Populando o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = InOut.leInt("Digite um n�mero");
		}

		// Imprimindo
		for (int i = 0; i < vetor.length; i++) {
			saida += "N�mero = " + vetor[i] + " -> ";
			saida += "Quadrado = " + Math.pow(vetor[i], 2) + " \n";
		}
		InOut.MsgDeInforma��o("Todos", saida);
	}
}
