package Lista8;

public class Ex2 {
	public static void main(String[] args) {
		String result = "";
		final int maxRand = 5, tamanho = 10;
		int soma = 0;
		double media = 0;

		int[] partidas = new int[tamanho];

		// Popula o vetor com o lançamento de 10 dados de 6 lados
		for (int i = 0; i < partidas.length; i++) {
			partidas[i] = (int) (Math.random() * maxRand + 1);
			result += partidas[i] + " - ";
			soma += partidas[i];
		}
		System.out.println(result);
		System.out.println("Soma = " + soma);
		
		soma = 0;
		for (int i = 0; i < partidas.length; i++) {
			soma += partidas[i];
		}
		
		media = (double)soma / partidas.length;

		InOut.MsgDeInformação("Resultado", "Media Aritimética: " + media);

	}
}















//media = (double) soma / partidas.length;