package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		
		String num2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		
		System.out.println(num1 + num2);
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		double soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + soma / 2);
		
		
	}

}
