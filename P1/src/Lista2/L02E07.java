package Lista2;
// Fa�a um programa que pergunte em que ano voc� nasceu e exiba quantos 
// anos voc� tem. Exiba tamb�m se voc� � mais velho que 18 anos inclusive, 
// se est� entre 15 e 18 anos, ou se tem menos que 15 anos. 

public class L02E07 {
	public static void main(String[] args) {
		int anoNasc, idadeAtual;
		final int anoAtual = 2017;

		anoNasc = InOut.leInt("Informe o ano do seu nascimento");
		idadeAtual = anoAtual - anoNasc;
		
		String saida = "Voc� est� com " + idadeAtual + " anos.";
		
		if (idadeAtual < 18) {
			saida += "\nVoc� � menor de idade";
		} else
			saida += "\nVoc� � maior de idade";
		InOut.MsgDeInforma��o("", saida);
	}
}
