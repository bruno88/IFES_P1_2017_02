package Lista7;

public class Ex1 {
	public static void main(String[] args) {
		String saida = "";
		final int maxRand = 99, tamanho = 20;
		int contImpares = 0;

		int[] vetor = new int[tamanho];

		// Populando o vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * maxRand);
		}

		// Imprimindo todos
		for (int i = 0; i < vetor.length; i++) {
			saida += vetor[i] + " - ";
		}
		InOut.MsgDeInforma��o("Todos", saida);

		// Imprimindo �mpares
		saida = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				saida += vetor[i] + " - ";
				contImpares++;
			}
		}
		
		InOut.MsgDeInforma��o("�mpares (" + contImpares + " )", saida);
	}
}
