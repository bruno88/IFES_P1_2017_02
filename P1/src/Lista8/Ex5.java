package Lista8;

public class Ex5 {
	public static void main(String[] args) {
		String result = "";
		final int maxRand = 6, tam = 100;

		int[] vetor = new int[tam];
		int[] vetor6Lados = new int[6];

		// Popula o vetor
		result += "Vetor original:\n| ";
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (1 + Math.random() * maxRand);
			result += vetor[i] + " | ";
		}
		System.out.println(result);
		
		result = "";
		// Para cada número do dado de 6 lados...
		result += "Resultados:\n";
		for (int i = 0; i < vetor.length; i++) {
			vetor6Lados[vetor[i] - 1]++;
		}

		// Imprimindo vetor
		for (int i = 0; i < vetor6Lados.length; i++) {
			result += "Face " + (i + 1) + " =  " + vetor6Lados[i] + "\n";
		}
		InOut.MsgDeInformação("", result);
	}
}