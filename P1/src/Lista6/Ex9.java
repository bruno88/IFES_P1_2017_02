package Lista6;

public class Ex9 {
	public static void main(String[] args) {
		InOut.MsgDeInforma��o("", "Vamos calcular a express�o x^y");
		int valX = InOut.leInt("Digite o n�mero de x");
		int valY = InOut.leInt("Digite o n�mero de y");
		int cont = valY;
		int potencia = 1;

		while (cont > 0) {
			potencia *= valX;
			cont--;
		}

		InOut.MsgDeInforma��o("Resultado", 
				valX + " ^ " +
				valY + " = " +
				potencia);
	}
}
