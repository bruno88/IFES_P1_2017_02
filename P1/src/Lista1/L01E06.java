package Lista1;
// Fa�a um programa que dado hora, dia, m�s e ano atual informe quantas horas se
// passaram desde o nascimento de Cristo.
// (n�o considere anos bissextos, e meses sempre com 30 dias)
public class L01E06 {
	public static void main(String[] args) {
		int hora, dia, mes, ano, horaCristo;
		
		hora = InOut.leInt("Informe a hora atual");
		dia = InOut.leInt("Informe o dia atual");
		mes = InOut.leInt("Informe o mes atual");
		ano = InOut.leInt("Informe o ano atual");
		
		horaCristo = hora+((dia-1)*24);
		
		horaCristo += (mes-1)*30*24;
		
		horaCristo += (ano-1)*12*30*24;
		
		InOut.MsgDeInforma��o("","Se passaram "+horaCristo+" "
				+ "horas desde o nascimento de Cristo");
	}
}
