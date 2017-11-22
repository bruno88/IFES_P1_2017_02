package Lista11;

public class Ex8 {
	public static void main(String[] args) {
		final int linhas = 2, colunas = 5;
		String result = "", diaSemana = "";
		double difAtual = 0, maiorDif = 0;
		String diaMaior = "";
		double[][] matriz = new double[linhas][colunas];

		// Preenchendo a matriz
		for (int j = 0; j < colunas; j++) {
			matriz[0][j] = InOut.leDouble("Digite a temperatura inicial");
			matriz[1][j] = InOut.leDouble("Digite a temperatura final");
		}

		// Imprimindo a matriz
		for (int i = 0; i < colunas; i++) {
			switch (i) {

			case 0:
				diaSemana = "Segunda";
				break;
			case 1:
				diaSemana = "Terça";
				break;
			case 2:
				diaSemana = "Quarta";
				break;
			case 3:
				diaSemana = "Quinta";
				break;
			case 4:
				diaSemana = "Sexta";
				break;
			}
			result += "\n" + diaSemana + "\n";
			for (int j = 0; j < linhas; j++) {
				result += matriz[j][i] + " | ";

			}
			difAtual = Math.abs(matriz[1][i] - matriz[0][i]);
			if (difAtual > maiorDif) {
				maiorDif = difAtual;
				diaMaior = diaSemana;
			}

		}
		result += "\nDia com maior variação: " + diaMaior 
				+ " com variação de " + maiorDif;
		System.out.println(result);

	}
}
