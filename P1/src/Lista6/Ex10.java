package Lista6;

public class Ex10 {
	public static void main(String[] args) {
		String saida = "";
		int op;
		double tempCelsius, tempFarenheit;
		
		do {
			op = InOut.leInt("Escolha a op��o desejada:\n"
					+ "1 - Celsius para Farenheit\n"
					+ "2 - Farenheit para Celsius\n\n"
					+ "0 - Encerrar o programa");
			
			switch (op) {
			case 1:
				tempCelsius = InOut.leDouble("Digite a temperatura em Celsius");
				tempFarenheit = (tempCelsius * 1.8) + 32;
				saida = "Voc� digitou: \n"
						+ tempCelsius + " (Celsius) \n"
						+ "que equivalem a " 
						+ tempFarenheit + " (Farenheit)";
				break;
			case 2:
				tempFarenheit = InOut.leDouble("Digite a temperatura em Farenheit");
				tempCelsius = (tempFarenheit - 32) / 1.8;
				saida = "Voc� digitou: \n"
						+ tempFarenheit + " (Farenheit) \n"
						+ "que equivalem a " 
						+ tempCelsius + "(Celsius)";
				break;
			case 0:
				saida = "Programa encerrado por comando do usu�rio";
				break;
			default:
				InOut.MsgDeErro("Erro", "Op��o incorreta !");
				break;
			}
			InOut.MsgDeInforma��o("", saida);
		} while (op != 0);
	}
}
