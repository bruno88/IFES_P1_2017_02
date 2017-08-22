package Lista1;
// Fa�a uma Programa para resolver equa��es de segundo grau
public class L01E05 {
	public static void main(String[] args) {
		double varA, varB, varC, delta, X1, X2;

		// aX� + bX + c = 0
		varA = InOut.leDouble("Informe o valor de A");
		varB = InOut.leDouble("Informe o valor de B");
		varC = InOut.leDouble("Informe o valor de C");

		// delta = /\ = b� - 4ac
		delta = Math.pow(varB, 2) - (4 * varA * varC);

		// X1 = (-b + raiz(delta)) / 2a
		X1 = (-varB + Math.sqrt(delta)) / (2 * varA);

		// X2 = X1 = (-b - raiz(delta)) / 2a
		X2 = (-varB - Math.sqrt(delta)) / (2 * varA);

		String saida = "X' = " + X1;
		saida += "\nX\" = " + X2;

		InOut.MsgDeInforma��o("", saida);
	}
}
//Caso de Teste:
//Equa��o de segundo grau: x� � 5x + 6 = 0;
//Entradas: a=1, b=-5, c=6;
//Sa�das: x1 = 3, x2 = 2