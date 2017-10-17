package Lista9;
public class ATA {

	public static void main(String[] args) {
		// i += j; -> i = i + j;
		/**
		*/
		int n = 10;
		int i = 0;
		int j = 0;
		int mn;
		int soma = 0;
		int soma2 = 0;
		int tt = 0;
		int ct = 0;

		int md1 = 0;
		int md2 = 0;
		int mr1 = 0;
		int mr2 = 0;
		// Vetores
		int[] vtmain1 = new int[n];
		int[] vtmain2 = new int[n];
		int[] vtmedia = new int[n]; // vetor que recebe valores ACIMA da média
		int[] vtamedia = new int[n]; // receberá valores ABAIXO da média
		int[] vtextra = new int[n + n];

		System.out.println("Primeiro vetor");
		for (i = 0; i < n; i++) {
			vtmain1[i] = (int) (Math.random() * 99 + 1);
			System.out.println(vtmain1[i]);
		}
		System.out.println("Segundo vetor");
		for (i = 0; i < n; i++) {
			vtmain2[i] = (int) (Math.random() * 99 + 1);
			System.out.println(vtmain2[i]);
		}

		mn = InOut.leInt(
				"-- Escolha a opção -- \n 1) Sortear novamente \n 2) Imprimir acima da média \n 3) Imprimir abaixo da média \n 4) União dos vetores");

		switch (mn) {
		// Reboot no vt principal
		case 1:
			for (i = 0; i < n; i++) {
				vtmain1[i] = (int) (Math.random() * 99 + 1);
				vtmain2[i] = (int) (Math.random() * 99 + 1);
			}
			System.out.print("Valores sorteados novamente");
			break;
		case 2:
			// Calculará a média dos números desses vetores e crie um novo vetor, que
			// receberá apenas os
			// números ACIMA da média. Imprima o vetor criado.
			System.out.println("------- Maiores q média");
			for (i = 0; i < n; i++) {
				soma = soma + vtmain1[i];
				soma = soma + vtmain2[i];
				tt = soma / (n + n);
			}
			System.out.println(tt);

			for (i = 0; i < n; i++) {
				if (vtmain1[i] > tt) {
					vtmedia[md1] = vtmain1[i];
					md1++;
				}

			}

			for (i = 0; i < n; i++) {
				if (vtmain2[i] > tt) {
					vtmedia[md2] = vtmain2[i];
					md2++;
				}

			}

			for (i = 0; i < n; i++) {
				if (vtmedia[i] == 0) {
					break;
				}
				System.out.println(vtmedia[i]);
			}
			for (i = 0; i < n; i++) {
				if (vtmedia[i] == 0) {
					break;
				}
				System.out.println(vtmedia[i]);
			}
			break;
		case 3:
			// 3 Calculará a média dos números desses vetores e crie um novo vetor, que
			// receberá apenas os
			// números ABAIXO da média. Imprima o vetor criado.
			System.out.println("------- Menores que média");
			for (i = 0; i < n; i++) {
				soma2 = soma2 + vtmain1[i];
				soma2 = soma2 + vtmain2[i];
				tt = soma2 / (n + n);
			}
			System.out.println(tt);

			for (i = 0; i < n; i++) {
				if (vtmain1[i] < tt) {
					vtamedia[mr1] = vtmain1[i];
					mr1++;
				}

			}

			for (i = 0; i < n; i++) {
				if (vtmain2[i] < tt) {
					vtamedia[mr2] = vtmain2[i];
					mr2++;
				}
			}

			for (i = 0; i < n; i++) {
				if (vtamedia[i] == 0) {
					break;
				}
				System.out.println(vtamedia[i]);
			}
			for (i = 0; i < n; i++) {
				if (vtamedia[i] == 0) {
					break;
				}
				System.out.println(vtamedia[i]);
			}

			break;

		case 4:
			// Crie um novo vetor, que irá conter todos os números presentes nos vetores
			// (união dos conjuntos). Não é necessário colocá-los de forma ordenada.
			// Coloque todos do primeiro vetor e, em seguida, todos do segundo vetor.
			System.out.println("------- Soma dos vetores");
			for (i = 0; i < n; i++) {
				vtextra[ct] = vtmain1[i];
				ct++;
			}
			for (i = 0; i < n; i++) {
				vtextra[ct] = vtmain2[i];
				ct++;
			}

			for (i = 0; i < vtextra.length; i++) {
				System.out.println(vtextra[i]);
			}

			// case 5:

		} // switch case

	}

}