package Lista1;
/* Fa�a um programa que o usu�rio informe o valor de 3 vari�veis, A, B e C. Depois o
algoritmo deve fazer A receber o valor de C, B receber o valor de A e C receber o valor de B, e
mostrar essas informa��es na tela.
 */
public class L01E04 {
	public static void main(String[] args) {
		int varA, varB, varC, aux;

		varA = InOut.leInt("Informe o valor de A");
		varB = InOut.leInt("Informe o valor de B");
		varC = InOut.leInt("Informe o valor de C");

		aux = varA;
		varA = varC; // A receber o valor de C
		varC = varB; // C receber o valor de B
		varB = aux; // B receber o valor de A

		String saida = "A = " + varA;
		saida += "\nB = " + varB;
		saida += "\nC = " + varC;

		InOut.MsgDeInforma��o("", saida);
	}
}
