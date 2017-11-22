package CorrecaoProva2;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int n = 10;
		int maxRand = 20, minRand = 1, menu;
		int vet1[] = new int[n];
		int vet2[] = new int[n];
		int vet3[] = new int[n];
		String txt1 = "", txt2 = "";
		for (int i = 0; i < n; i++) { // Populando os vetores

			vet1[i] = (int) (Math.random() * maxRand) + minRand;
			vet2[i] = (int) (Math.random() * maxRand) + minRand;
			txt1 += vet1[i] + "|";
			txt2 += vet2[i] + "|";
		}
		System.out.println("Vetor 1: " + txt1 + "\nVetor 2: " + txt2);
		do {
			txt1 = "";
			txt2 = "";
			int num = 0,numero2=0, cont1 = 0, cont2 = 0;
			menu = InOut
					.leInt("Digite um opção abaixo:\n1 - Sortear novos vetores\n2 - Exibir Vetor intercalado\n3 - Númeoros Menores\n"
							+ "4 - Lista de Repetidos\n0 - Encerrar o Programa");
			switch (menu) {
			case 1:
				for (int i = 0; i < n; i++) {// criando novos vetores
					vet1[i] = (int) (Math.random() * maxRand) + minRand;
					vet2[i] = (int) (Math.random() * maxRand) + minRand;
					txt1 += vet1[i] + "|";
					txt2 += vet2[i] + "|";

				}
				txt1 = ("Novo Vetor 1: " + txt1 + "\nNovo Vetor 2: " + txt2);
				break;
			case 2:
				for (int i = 0; i < n; i++) {
					vet3[i] = vet1[i];
					txt1 += vet3[i] + "|";
					vet3[i] = vet2[i];
					txt1 += vet3[i] + "|";

				}
				txt1 = ("Vetor intercalado:" + txt1);
				break;
			case 3:
				num = InOut.leInt("Digite um número para ser o maior");
				for (int i = 0; i < n; i++) {
					if (num > vet1[i]) {// Verificando no vetor do número maior
						numero2 = vet1[i];//preenchendo o inteiro com os valores do vetor que foi menor ao valor digitado 
						txt2+=numero2+"|";//preenchedo a string com veotres menoeres que o valor escolhido
						cont1++;// contando quantas vezes esse número foi maior
					}
					if (num > vet2[i]) {
						numero2 = vet2[i];
						txt2+=numero2+"|";
						cont1++;
					}

				}
				txt1 = ("Número escolhido pelo usuário foi " + num
						+ "\n " + num + " foi maior :"
						+ cont1 + " vez(es)"+"\nNumeros que são menores "+txt2);
				break;
			case 4:
				num = InOut.leInt("Digite um número para consulta");
				for (int i = 0; i < n; i++) {
					if (num == vet1[i]) {// Verificando no vetor do número for
											// igual
						cont1++;// contando quantas vezes esse número foi igual

					}
					if (num == vet2[i]) {
						cont2++;

					}
				}
				
				if (cont2 > cont1) {
						txt2 = "\nQuantidade de vezes"
								+ "repetidas foi " + cont2
								+ "  no Vetor 2";

					}
					if (cont1 > cont2) {
						txt2 = "\nQuantidade de vezes"
								+ "repetidas foi " + cont1
								+ "  no Vetor 1";
					}
					if (cont1==cont2){// verificando que os contadores são iguais
						txt2 = "\nA Quantidade de vezes repetidas foi igual nos  dois vetores, que foi:  "+ cont1;
					}

				
				txt1 = ("Número escolhido pelo usuário foi " + num
						+ txt2);
				break;
			case 0:
				txt1 = "Programa encerrado";
				break;
			default:
				txt1 = "Opção invalida digite novamente";
				break;

			}
			System.out.println(txt1);
		} while (menu != 0);
	}
}