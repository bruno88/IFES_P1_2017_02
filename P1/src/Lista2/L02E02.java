package Lista2;
/* Modifique o algoritmo da m�dia do aluno �Quest�o 3 dos exerc�cios sequenciais� 
 * para informar: APROVADO, caso a nota final esteja no 
 * intervalo 70 � 100, RECUPERA��O, caso a nota final esteja no 
 * intervalo 50 � 69 e REPROVADO, caso a nota final esteja no intervalo 0 � 49.
 */

public class L02E02 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		final double pesoN1 = 2, pesoN2 = 4, pesoN3 = 4;

		String nome = InOut.leString("Informe o seu nome");

		nota1 = InOut.leDouble("Informe o valor da nota 1");
		nota2 = InOut.leDouble("Informe o valor da nota 2");
		nota3 = InOut.leDouble("Informe o valor da nota 3");

		media = (nota1 * pesoN1) + (nota2 * pesoN2) + (nota3 * pesoN3);
		media = (media / (pesoN1 + pesoN2 + pesoN3));
		InOut.MsgDeInforma��o("", "A m�dia final de " + nome + " foi " + media);

		if (media > 6.9 && media <= 10.0) {
			InOut.MsgDeInforma��o("", "O aluno " + nome + " est� APROVADO");
		} else if (media >= 5.0 && media <= 6.9) {
			InOut.MsgDeInforma��o("", "O aluno " + nome + " est� de RECUPERA��O");
		} else
			InOut.MsgDeInforma��o("", "O aluno " + nome + " est� REPROVADO");

	}
}
