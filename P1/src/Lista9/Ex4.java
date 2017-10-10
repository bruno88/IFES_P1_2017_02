package Lista9;

public class Ex4 {
	public static void main(String[] args) {
		String result = "";
		final int tam = 5;
		int posAtual = 0;
		String[] nomes = new String[tam];
		double[] salarios = new double[tam];
		double[] novosSalarios = new double[tam];
		double bonif;

		// Populando o vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = InOut.leString("Digite o nome do funcion�rio");
			salarios[i] = InOut.leDouble("Digite o sal�rio de : " + nomes[i]);
		}

		// Lendo o n�mero de funcion�rios selecionados
		int numSelec = InOut.leInt("Digite o n�mero de funcion�rios selecionados");

		String[] selecionados = new String[numSelec];

		// Obtendo os funcion�rios selecionados
		for (int i = 0; i < selecionados.length; i++) {
			selecionados[i] = InOut.leString("Digite o nome do funcion�rio");
		}

		// Obtendo o percentual de bonifica��o
		bonif = InOut.leDouble("Digite o percentual de bonifica��o");
		
		// clona o vetor para garantir os mesmos valores
		novosSalarios = salarios.clone();
		
		// Ajustando os valores
		for (int i = 0; i < posAtual; i++) {
			for (int j = 0; j < nomes.length; j++) {
				if (selecionados[i].equalsIgnoreCase(nomes[j])) {
					novosSalarios[j] += (salarios[j] * bonif) / 100;
				}
			}
		}

		// Imprimindo os Vetores
		result = "Sal�rio dos Funcion�rios: \n\n";
		for (int i = 0; i < salarios.length; i++) {
			result += nomes[i] + ": Sal�rio Original: " + salarios[i] + " - Novo sal�rio: " + novosSalarios[i] + "\n";
		}

		InOut.MsgDeInforma��o("", result);

	}
}
