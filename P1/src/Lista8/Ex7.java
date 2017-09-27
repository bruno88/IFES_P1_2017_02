package Lista8;

public class Ex7 {
	public static void main(String[] args) {
		String result = "";
		final int maxRand = 9, tamSorteio = 5, tamAposta = 2;
		int somaJ1 = 0, somaJ2 = 0, somaParcial = 0;

		int[] sorteio = new int[tamSorteio];
		int[] apostasJ1 = new int[tamAposta];
		int[] apostasJ2 = new int[tamAposta];

		// Popula o vetor
		for (int i = 0; i < sorteio.length; i++) {
			sorteio[i] = (int) (Math.random() * maxRand + 1);
		}

		// Imprime vetor (PARA TESTES APENAS!)
		for (int i = 0; i < sorteio.length; i++) {
			result += sorteio[i] + " - ";
		}
		InOut.MsgDeInformação("", result);

		// Lê as apostas do J1
		for (int i = 0; i < apostasJ1.length; i++) {
			apostasJ1[i] = InOut.leInt("Digite um inteiro para apostar");
		}

		// Lê as apostas do J2
		for (int i = 0; i < apostasJ2.length; i++) {
			apostasJ2[i] = InOut.leInt("Digite um inteiro para apostar");
		}

		// Verifica os acertos do J1
		System.out.println("Jogador 1: \n");
		for (int i = 0; i < apostasJ1.length; i++) {
			result = "";
			somaParcial = 0;
			result += apostasJ1[i] + " ";
			for (int j = 0; j < sorteio.length; j++) {
				if (apostasJ1[i] == sorteio[j]) {
					somaParcial++;
					somaJ1++;
				}
			}
			result += "(" + somaParcial + "x)";
			System.out.println(result);
		}
		System.out.println(" = Total " + somaJ1 + "\n");

		// Verifica os acertos do J2
		System.out.println("Jogador 2: \n");
		for (int i = 0; i < apostasJ2.length; i++) {
			result = "";
			somaParcial = 0;
			result += apostasJ2[i] + " ";
			for (int j = 0; j < sorteio.length; j++) {
				if (apostasJ2[i] == sorteio[j]) {
					somaParcial++;
					somaJ2++;
				}
			}
			result += "(" + somaParcial + "x)";
			System.out.println(result);
		}
		System.out.println(" = Total " + somaJ2 + "\n");

		// Calcula vencedor
		if (somaJ1 > somaJ2) {
			System.out.println("Vencedor: Jogador 1");
		} else {
			if (somaJ2 > somaJ1) {
				System.out.println("Vencedor: Jogador 2");
			} else {
				System.out.println("Vencedor: EMPATE!");
			}
		}
	}
}