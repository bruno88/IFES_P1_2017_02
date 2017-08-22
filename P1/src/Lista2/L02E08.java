package Lista2;
/*
 * Fa�a uma Programa que receba o c�digo correspondente ao cargo 
 * de um funcion�rio e o seu sal�rio base. O programa deve imprima seu cargo 
 * e o seu sal�rio liquido seguindo o percentual de aumento 
 * a qual este funcion�rio tem direito conforme a tabela abaixo: 

C�digo		Cargo 		Percentual
0l 		Escritur�rio 	50%
02 		Secret�rio 	35%
03 		Caixa 		20%
04 		Gerente 	10%
05 		Diretor 		N�o tem aumento 
*/

public class L02E08 {
	public static void main(String[] args) {
		int codCargo;
		double salario;

		codCargo = InOut.leInt("Informe o codigo do cargo");
		salario = InOut.leDouble("Digite seu Salario Base");

		String saida = "Seu cargo � : ";

		if (codCargo == 1) {
			saida += "Escritu�rio";
			salario *= 1.5;
			saida += "\nSeu novo sal�rio �: " + salario;
		} else if (codCargo == 2) {
			saida += "Secret�rio";
			salario *= 1.35;
			saida += "\nSeu novo sal�rio �: " + salario;
		} else if (codCargo == 3) {
			saida += "Caixa";
			salario *= 1.2;
			saida += "\nSeu novo sal�rio �: " + salario;
		} else if (codCargo == 4) {
			saida += "Gerente";
			salario *= 1.1;
			saida += "\nSeu novo sal�rio �: " + salario;
		} else {
			saida += "Diretor";
			saida += "\nSeu sal�rio se manteve em : " + salario;
		}
		InOut.MsgDeInforma��o("", saida);
	}
}
