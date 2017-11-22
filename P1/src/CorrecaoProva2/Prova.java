package CorrecaoProva2;

public class Prova {
	public static void main(String[] args) {
		String result = "", strVet1 = "", strVet2 = "";
		final int tam = 10, minRand = 0, maxRand = 20;
		int op, posAtual = 0;

		int[] vet1 = new int[tam];
		int[] vet2 = new int[tam];
		int[] vet3 = new int[tam*2];

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
					+ "2 - Exibir vetor intercalado \n" 
					+ "3 - Listar MENORES que o corte \n" 
					+ "4 - Listar números repetidos \n" 
					+ "0 - Encerrar o programa");

			// limpa as variáveis para evitar erros
			result = "";
			strVet1 = "";
			strVet2 = "";
			posAtual = 0;
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

			// 2 - Exibir vetor intercalado
			case 2:				
				// Populando o vetor de intercalados
				for (int i = 0; i < tam; i++) {
					vet3[posAtual] = vet1[i];
					posAtual++;
					vet3[posAtual] = vet2[i];
					posAtual++;
				}

				// Imprime o vetor
				for (int i = 0; i < vet3.length; i++) {
					result += vet3[i] + " - ";
				}
					
				break;
				
			// 3 - Listar MENORES que o corte
			case 3:
				int corte = InOut.leInt("Digite o número de corte");
				
				for (int i = 0; i < vet1.length; i++) {
					// Obtendo os menores que corte no vet1
					if (vet1[i]<corte) {
						vet3[posAtual] = vet1[i];
						posAtual++;
					}
					// Obtendo os menores que corte no vet2
					if (vet2[i]<corte) {
						vet3[posAtual] = vet2[i];
						posAtual++;
					}
				}
				
				// Imprime o vetor
				result = "Corte escolhido = " + corte + "\nTotal de "
						+ "números menores que o corte: " + posAtual + "\n"
								+ "Números: ";
						
				for (int i = 0; i < posAtual; i++) {
					result += vet3[i] + " - ";
				}
				break;

			// 4 - Listar números repetidos
			case 4:
				int termo = InOut.leInt("Digite o número a ser consultado");
				int cont1 = 0, cont2 = 0;
				for (int i = 0; i < vet1.length; i++) {
					// Obtendo os iguais ao termo no vet1
					if (vet1[i] == termo) {
						cont1++;
					}
					// Obtendo os iguais ao termo no vet2
					if (vet2[i] == termo) {
						cont2++;
					}
				}

				if (cont1 > cont2) {
					result = termo + " apareceu " + cont1 + " vezes no vetor 1";
				} else {
					if (cont1 < cont2) {
						result = termo + " apareceu " + cont2 + " vezes no vetor 2";
					} else {
						result = termo + " apareceu " + cont1 + " em ambos os vetores";
					}
				}
				
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
