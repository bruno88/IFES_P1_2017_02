package Lista1;

// Fa�a um programa que leia os lados de um tri�ngulo ret�ngulo e exiba sua hipotenusa.
// Hipotenusa� = Cateto Adjacente� + Cateto Oposto�
// H� = CA� + CO�
// H = raiz de (CA� + CO�)

public class L01E07 {

	public static void main(String[] args) {
		double altura = InOut.leDouble("Digite a altura do tri�ngulo");
		double base = InOut.leDouble("Digite a base do tri�ngulo");

		double hipotenusa = Math.pow(base, 2) + Math.pow(altura, 2);
		hipotenusa = Math.sqrt(hipotenusa);

		InOut.MsgDeInforma��o("Resultado", "A hipotenusa do triangulo digitado � : " + hipotenusa);
	}

}
// Caso de Teste
// http://alunosonline.uol.com.br/upload/conteudo/images/trigonometria2.JPG
// Base = 4
// Altura = 3
// Hipotenusa = 5