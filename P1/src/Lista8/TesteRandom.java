package Lista8;

public class TesteRandom {
	public static void main(String[] args) {
		final int maxRand = 5, tam = 10000;

		int[] vetor = new int[tam];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (1 + Math.random() * maxRand);
			if (vetor[i] == 6) {
				InOut.MsgDeInformação("", "Encontrei um 6 !");
			}
		}
		InOut.MsgDeInformação("", "");
	}
}