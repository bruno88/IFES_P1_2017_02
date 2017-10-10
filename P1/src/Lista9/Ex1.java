package Lista9;

public class Ex1 {
	public static void main(String[] args) {
		String result = "";
		final int tam = 5;
		double soma = 0, media = 0;
		
		String[] nomes = new String[tam];
		double[] notas = new double[tam];

		// Uso de constantes de Vetor para agilizar 
		// a entrada de dados para teste
		// String[] nomes = { "Bruno", "Pedro", "Maria", "João", "Joana" };
		// double[] notas = { 9.8, 6.4, 10.0, 7.5, 4.5 };


		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = InOut.leString("Entre com o nome do aluno.");
			notas[i] = InOut.leDouble("Entre com a Nota Final deste aluno.");
			soma += notas[i];
		}

		media = (soma / notas.length);

		result = "A média da sala é: " + media;
		result += "\nLista dos alunos cuja nota é superior à média da turma: \n\n";
		for (int i = 0; i < nomes.length; i++) {
			if (notas[i] > media)
				result += nomes[i] + ", nota: " + notas[i] + "\n";
		}

		InOut.MsgDeInformação("", result);

	}
}
