package Lista8;

import Lista6.InOut;

public class Ex6 {
	public static void main(String[] args) {
		String result = "";
		final int tamanho = 20;
		int op, posAtual = 0;
		double tempCelsius, tempFarenheit;
		
		double[] vetCelsius = new double[tamanho];
		double[] vetFarenheit = new double[tamanho];

		do {
			op = InOut.leInt("Escolha a opção desejada:\n" 
					+ "1 - Informar graus em Celsius\n"
					+ "2 - Informar graus em Farenheit\n"
					+ "3 - Imprimir os dois vetores\n\n"
					+ "0 - Encerrar o programa");

			switch (op) {
			case 1:
				tempCelsius = InOut.leDouble("Digite a temperatura em Celsius");
				tempFarenheit = (tempCelsius * 1.8) + 32;
				result = "Você digitou: \n" + tempCelsius 
						+ " (Celsius) \n" + "que equivalem a " 
						+ tempFarenheit	+ " (Farenheit)";				
				vetCelsius[posAtual] = tempCelsius;
				posAtual++;
				vetFarenheit[posAtual] = tempFarenheit;
				
				break;
			case 2:
				tempFarenheit = InOut.leDouble("Digite a temperatura em Farenheit");
				tempCelsius = (tempFarenheit - 32) / 1.8;
				result = "Você digitou: \n" + tempFarenheit + " (Farenheit) \n" + "que equivalem a " + tempCelsius
						+ "(Celsius)";
				vetCelsius[posAtual] = tempCelsius;
				vetFarenheit[posAtual] = tempFarenheit;
				posAtual++;
				break;
			case 3:
				result = "";
				for (int i = 0; i < posAtual; i++) {
					result += (i+1) + "º termo: " 
							+ vetCelsius[i] + "ºC ou " 
							+ vetFarenheit[i]+ "º F \n"; 				
				}	
				break;
			case 0:
				result = "Programa encerrado por comando do usuário";
				break;
			default:
				InOut.MsgDeErro("Erro", "Opção incorreta !");
				break;
			}
			InOut.MsgDeInformação("", result);
		} while (op != 0);
	}
}