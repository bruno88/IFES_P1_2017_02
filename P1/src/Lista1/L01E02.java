package Lista1;
/* Fa�a um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e
mostre a idade dessa pessoa quantos anos ela ter� em 2020 e no ano corrente.*/

public class L01E02 {
	public static void main(String[] args) {
		int anoNascimento;
		int anoAtual;
		int idadeAtual;
		int idade2020;
		final int dataFixa = 2020;
		String saida;
		
		anoNascimento = InOut.leInt("Informe o seu ano de nascimento");
		anoAtual = InOut.leInt("Informe o ano atual");
		idadeAtual = anoAtual-anoNascimento;
		idade2020 = dataFixa-anoNascimento;
		
		saida = "Voc� tem "+idadeAtual+" anos.";
		saida +="\nEm 2020 voc� ter� "+idade2020+" anos.";
		InOut.MsgDeInforma��o("",saida);
	}
}
