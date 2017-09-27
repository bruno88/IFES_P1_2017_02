package Lista6;

public class Ex9 {
	public static void main(String[] args) {
		InOut.MsgDeInformação("", "Vamos calcular a expressão x^y");
		int valX = InOut.leInt("Digite o número de x");
		int valY = InOut.leInt("Digite o número de y");
		int cont = valY;
		int potencia = 1;

		while (cont > 0) {
			potencia *= valX;
			cont--;
		}

		InOut.MsgDeInformação("Resultado", 
				valX + " ^ " +
				valY + " = " +
				potencia);
	}
}
