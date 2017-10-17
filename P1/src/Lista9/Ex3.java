package Lista9;

public class Ex3 {
	public static void main(String[] args) {
		String result = "";
		final int tam = 5;
		String[] nomes = new String[tam];
		double[] salarios = new double[tam];
		double bonif;

		// Populando o vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = InOut.leString("Digite o nome do funcion�rio");
			salarios[i] = InOut.leDouble("Digite o sal�rio de : " + nomes[i]);
		}
		// Uso de constantes de Vetor para agilizar 
		// a entrada de dados para teste
		// String[] nomes = { "Bruno", "Pedro", "Maria", "Jo�o", "Joana" };
		// double[] salarios = { 980, 680, 1510, 750, 450 };

		// Obtendo o percentual de bonifica��o
		bonif = InOut.leDouble("Digite o percentual de bonifica��o");

		// Ajustando os valores
		for (int i = 0; i < salarios.length; i++) {
			salarios[i] += (salarios[i] * bonif) / 100;
		}

		// Imprimindo os Vetores
		result = "Novos sal�rios: \n\n";
		for (int i = 0; i < salarios.length; i++) {
			result += nomes[i] + ": " + salarios[i] + "\n";
		}

		InOut.MsgDeInforma��o("", result);

	}
}
