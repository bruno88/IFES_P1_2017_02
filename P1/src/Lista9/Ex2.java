package Lista9;

public class Ex2 {
	public static void main(String[] args) {
		String result = "";

		int tam = InOut.leInt("Digite quantos n�meros ser�o sorteados");
		int[] sorteio = new int[tam];

		int minRand = InOut.leInt("Digite o menor valor aleat�rio");
		int maxRand = InOut.leInt("Digite o maior valor aleat�rio");

		if (maxRand > minRand) {
			InOut.MsgDeErro("Erro", "O M�ximo � menor que o m�nimo");
		}

		for (int i = 0; i < sorteio.length; i++) {

			sorteio[i] = (int) (minRand + (Math.random() * (maxRand - minRand)));
			result += sorteio[i] + "\n";
		}

		InOut.MsgDeInforma��o("", result);

	}
}
