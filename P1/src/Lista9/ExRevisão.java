package Lista9;

public class ExRevisão {
	public static void main(String[] args) {
		String result = "", strVet1 = "", strVet2 = "";
		final int tam = 10, minRand = 1, maxRand = 100;
		int op, posAtual = 0, media = 0, soma = 0, maior = -1, vetorMaior = -1, indiceMaior = -1;

		int[] vet1 = new int[tam];
		int[] vet2 = new int[tam];
		int[] selecionados = new int[tam * 2];

		// Popula o vetor
		for (int i = 0; i < tam; i++) {
			vet1[i] = (int) (minRand + (Math.random() * maxRand));
			strVet1 += vet1[i] + " - ";
			vet2[i] = (int) (minRand + (Math.random() * maxRand));
			strVet2 += vet2[i] + " - ";
		}
		
		System.out.println("Vetor 1: " + strVet1);
		System.out.println("Vetor 2: " + strVet2);

		do {
			op = InOut.leInt("Digite a opção abaixo: \n\n" 
					+ "1 - Sortear novamente o vetor \n"
					+ "2 - Imprimir ACIMA da média \n" 
					+ "3 - Imprimir ABAIXO da média \n" 
					+ "4 - União dos Vetores \n"
					+ "5 - Imprimir vetor e índice do maior número \n\n" 
					+ "0 - Encerrar o programa");
			
			strVet1 = "";
			strVet2 = "";
			media = 0;
			soma = 0;
			result = "";
			posAtual = 0;
			// limpa as variáveis para evitar erros
			maior = -1;
			vetorMaior = -1;
			indiceMaior = -1;
			//
			
			switch (op) {
			// 1 - Sortear novamente o vetor
			case 1:
				for (int i = 0; i < tam; i++) {
					vet1[i] = (int) (minRand + (Math.random() * maxRand));
					strVet1 += vet1[i] + " - ";
					vet2[i] = (int) (minRand + (Math.random() * maxRand));
					strVet2 += vet2[i] + " - ";
				}
				System.out.println("\nVetor 1: " + strVet1);
				System.out.println("Vetor 2: " + strVet2);
				result = "Foram gerados novos Vetores !";
				break;

			// 2 - Imprimir ACIMA da média
			case 2:
				for (int i = 0; i < tam; i++) {
					soma += vet1[i] + vet2[i];
				}

				media = soma / (tam * 2);
				System.out.println("Media dos 2 vetores: " + media);

				for (int i = 0; i < tam; i++) {
					if (vet1[i] > media) {
						selecionados[posAtual] = vet1[i];
						posAtual++;
					}
					if (vet2[i] > media) {
						selecionados[posAtual] = vet2[i];
						posAtual++;
					}

				}

				for (int i = 0; i < posAtual; i++) {
					result += selecionados[i] + " - ";
				}
				break;

			// 3 - Imprimir ABAIXO da média
			case 3:
				
				for (int i = 0; i < tam; i++) {
					soma += vet1[i] + vet2[i];
				}

				media = soma / (tam * 2);
				System.out.println("Media dos 2 vetores: " + media);

				
				for (int i = 0; i < tam; i++) {
					if (vet1[i] < media) {
						selecionados[posAtual] = vet1[i];
						posAtual++;
					}
					if (vet2[i] < media) {
						selecionados[posAtual] = vet2[i];
						posAtual++;
					}

				}

				for (int i = 0; i < posAtual; i++) {
					result += selecionados[i] + " - ";
				}
				break;

			// 4 - União dos Vetores
			case 4:
				result = "";

				for (int i = 0; i < tam; i++) {
					selecionados[i] = vet1[i];
					selecionados[i + tam] = vet2[i];
				}

				for (int i = 0; i < selecionados.length; i++) {
					result += selecionados[i] + " - ";
				}

				break;

			// 5 - Imprimir vetor e índice do maior número
			case 5:
				
				for (int i = 0; i < tam; i++) {
					if (vet1[i] > maior) {
						maior = vet1[i];
						vetorMaior = 1;
						indiceMaior = i;
					} 
					if (vet2[i] > maior) {
						maior = vet2[i];
						vetorMaior = 2;
						indiceMaior = i;
					}
				}
				result = "O maior termo é o " + maior 
						+ " e se encontra no vetor " + vetorMaior 
						+ ", índice " + indiceMaior;
				break;

			// 0 - Encerrar o programa
			case 0:
				result = "Programa encerrado por comando do usuário !";
				break;
			default:
				result = "Entrada inválida !";
			}
			InOut.MsgDeInformação("", result);
		} while (op != 0);

	}
}
