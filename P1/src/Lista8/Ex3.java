package Lista8;

public class Ex3 {
	public static void main(String[] args) {
		String saida = "";
		final int maxRand = 9, tamanho = 5;
		int result, opJogador;

		int[] partidas = new int[tamanho];

		// 1 - Cara, 2 - Coroa
		for (int i = 0; i < partidas.length; i++) {
			// Pra melhorar o random:
			result = (int) (Math.random() * maxRand + 1);
			// Mod 2  só pode retornar 0 ou 1, +1 retorna 1 ou 2.
			result = result % 2 + 1;
			
			opJogador = InOut.leInt("Digite 1 para Cara ou 2 para Coroa");
			
			if (opJogador == result) {
				InOut.MsgDeInformação("Resultado", "Você venceu!");
				partidas[i] = 1;
			} else {
				InOut.MsgDeInformação("Resultado", "Você perdeu!");
				partidas[i] = 0;
			}
		}

		for (int i = 0; i < partidas.length; i++) {
			saida += "Partida " + (i + 1) + ": ";
			if (partidas[i] == 1) {
				saida += "Você venceu! \n";
			} else {
				saida += "Você perdeu! \n";
			}
		}
		InOut.MsgDeInformação("Todos", saida);

	}
}
