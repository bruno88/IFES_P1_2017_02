package Lista2;
/* Elabore um algoritmo que verifique se um dado n�mero informado pelo 
 * usu�rio � PAR ou �MPAR.
 */

public class L02E01 {
	public static void main(String[] args) {
		int numero;

		numero = InOut.leInt("Informe o n�mero");

		if (numero % 2 == 0) {
			InOut.MsgDeInforma��o("", "O N�mero � PAR");
		} else {
			InOut.MsgDeInforma��o("", "O N�mero � IMPAR");
		}

	}
}
