package Lista1;
public class ExerciciosDeSala {

	public static void main(String[] args) {
		// Fa�a um programa que l� 1 n�mero inteiro e o imprime para o usu�rio

		int numero = InOut.leInt("Digite um n�mero");
		InOut.MsgDeInforma��o("Resultado", "Voc� digitou o n�mero: " + numero);

		// Fa�a um programa que l� o nome de duas pessoas e as imprime para o usu�rio

		String nome1 = InOut.leString("Digite o primeiro nome");
		String nome2 = InOut.leString("Digite o segundo nome");
		InOut.MsgDeInforma��o("Resultado", "Voc� digitou os nomes: " + nome1 + " e " + nome2);

		/*
		 * Fa�a um programa que l� o valor bruto do produto e calcula seu valor final,
		 * sendo que sempre ser� cobrado 10% de imposto sobre o valor bruto
		 */

		final double imposto = 0.1;
		double valorBruto = InOut.leDouble("Digite o valor do produto");
		double valorFinal = (valorBruto * (1 - imposto));
		InOut.MsgDeInforma��o("Resultado", "O valor final do produto �: " + valorFinal);

		/*
		 * Fa�a um programa que l� o nome de um aluno e suas 3 notas e calcula a m�dia
		 * aritim�tica
		 */

		String nomeAluno = InOut.leString("Digite o nome do aluno");
		double nota1 = InOut.leDouble("Digite a primeira nota do aluno " + nomeAluno);
		double nota2 = InOut.leDouble("Digite a segunda nota do aluno " + nomeAluno);
		double nota3 = InOut.leDouble("Digite a terceira nota do aluno " + nomeAluno);
		double mediaArit = (nota1 + nota2 + nota3) / 3;
		InOut.MsgDeInforma��o("Resultado", "A m�dia aritim�tica das notas digitadas � : " + mediaArit);

	}
}