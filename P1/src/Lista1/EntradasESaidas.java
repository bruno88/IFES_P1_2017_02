package Lista1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradasESaidas {

	public static void main(String[] args) {
		// Exemplos de Leitura e Escrita de dados

		// Via Scanner

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int aux = sc1.nextInt();
		System.out.println("Voc� digitou o n�mero: " + aux);
		sc1.close();

		// Via InOut

		int aux2 = InOut.leInt("Digite um n�mero");
		InOut.MsgDeInforma��o("Resultado", "Voc� digitou o n�mero: " + aux2);

		// via JOptionPane

		String aux3 = JOptionPane.showInputDialog("digite um n�mero");
		JOptionPane.showMessageDialog(null, "Voc� digitou o n�mero: " + aux3);

	}
}