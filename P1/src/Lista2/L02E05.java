package Lista2;
/* Fa�a uma Programa que receba a idade de um atleta e
 * imprima a sua categoria seguindo as regras:
Infantil A 5 - 7 anos
Infantil B 8 - 10 anos
Juvenil A 11- 13 anos
Juvenil B 14- 17 anos
S�nior maiores de 18 anos
*/

public class L02E05 {
	public static void main(String[] args) {
		int idade;

		idade = InOut.leInt("Informe a sua idade");

		if (idade >= 5 && idade <= 7) {
			InOut.MsgDeInforma��o("", "Sua categoria � Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			InOut.MsgDeInforma��o("", "Sua categoria � Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			InOut.MsgDeInforma��o("", "Sua categoria � Juvenil A");
		} else if (idade >= 13 && idade <= 17) {
			InOut.MsgDeInforma��o("", "Sua categoria � Juvenil B");
		} else {
			InOut.MsgDeInforma��o("", "Sua categoria � Senior");
		}

	}
}
