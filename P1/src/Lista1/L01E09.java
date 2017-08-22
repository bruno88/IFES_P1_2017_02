package Lista1;

/* Fa�a um programa para calcular o sal�rio de um funcion�rio, o usu�rio deve informar o
sal�rio base, o numero de horas extras trabalhadas e o numero de faltas. O programa deve
mostrar na tela o salario liquido do funcion�rio seguindo os crit�rios abaixo.
* Para cada hora extra trabalhada h� um acr�scimo igual ao valor do sal�rio base
dividido por 88.
* Para cada falta do funcion�rio h� um desconto igual ao valor do salario base dividido
por 22.
* Despois desses valores calculados h� um acr�scimo de 6% de insalubridade.
* Em cima apenas do sal�rio base a um desconto de 8% de previd�ncia privada */

public class L01E09 {

	public static void main(String[] args) {
		final double percentInsal = 0.06;
		final double percentPrevP = 0.08;
		final int baseCalcHrExtra = 88;
		final int baseCalcFaltas = 22;

		double salarioBase = InOut.leDouble("Digite o sal�rio base");
		int horasExtras = InOut.leInt("Digite o n�mero de horas extras");
		int numFaltas = InOut.leInt("Digite o n�mero de faltas");

		// Recebe o sal�rio Base
		double salarioLiq = salarioBase;

		// Adiciona a bonifica��o por Horas Extras trabalhadas
		salarioLiq += horasExtras * (salarioBase / baseCalcHrExtra);

		// Desconta as faltas
		salarioLiq -= numFaltas * (salarioBase / baseCalcFaltas);

		// Adiciona a bonifica��o por Insalubridade
		salarioLiq *= (1 + percentInsal);

		// Desconta a previd�ncia privada
		salarioLiq -= (salarioBase * percentPrevP);

		InOut.MsgDeInforma��o("Resultado", "O Sal�rio Liquido � : R$ " + salarioLiq);
	}

}
// Caso de Teste
// Entradas:
// Salario Base = 2000
// Horas extras = 8
// Faltas = 3
// Sa�das:
// Salario Liq = 2000 + 181,8181 - 272,7272
// Salario Liq = 1909,0909 * 1,06 = 2023,6363
// Salario Liq = 2023,6363 - (2000 * 0,08) = 2023,6363 - 160 = 1863,6363