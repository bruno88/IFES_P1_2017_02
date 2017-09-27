package CorreçãoProva1.ProvaB;

import Lista1.InOut;

public class Questão2 {

	public static void main(String[] args) {
		String saida = "";
		
		int diaMes;

		diaMes = InOut.leInt("Digite um número inteiro entre 1 e 12");
		saida = diaMes + " - ";
		
		switch (diaMes) {
		case 1:
			saida += "Janeiro";
			break;
		case 2:
			saida += "Fevereiro";
			break;
		case 3:
			saida += "Março";
			break;
		case 4:
			saida += "Abril";
			break;
		case 5:
			saida += "Maio";
			break;
		case 6:
			saida += "Junho";
			break;
		case 7:
			saida += "Julho";
			break;
		case 8:
			saida += "Agosto";
			break;
		case 9:
			saida += "Setembro";
			break;
		case 10:
			saida += "Outubro";
			break;
		case 11:
			saida += "Novembro";
			break;
		case 12:
			saida += "Dezembro";
			break;
		default:
			InOut.MsgDeErro("Erro!", "Opção Inválida !");
			System.exit(0);
		}
		InOut.MsgDeInformação("Resultado", saida);
	}

}
