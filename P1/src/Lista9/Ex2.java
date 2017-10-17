package Lista9;

public class Ex2 {
	public static void main(String[] args) {
		String result = "";

		int tam = InOut.leInt("Digite quantos números serão sorteados");
		int[] sorteio = new int[tam];

		int minRand = InOut.leInt("Digite o menor valor aleatório");
		int maxRand = InOut.leInt("Digite o maior valor aleatório");

		if (maxRand > minRand) {
			InOut.MsgDeErro("Erro", "O Máximo é menor que o mínimo");
		}

		for (int i = 0; i < sorteio.length; i++) {

			sorteio[i] = (int) (minRand + (Math.random() * (maxRand - minRand)));
			result += sorteio[i] + "\n";
		}

		InOut.MsgDeInformação("", result);

	}
}
