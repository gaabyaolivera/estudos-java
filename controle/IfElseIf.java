package controle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Digite a sua m�dia: ");
		double media = Double.parseDouble(num);
		System.out.println(media);
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado(a)");
			
		} else if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
			
		} else if (media <4.5 && media >=0) {
			System.out.println("Reprovado");
			
		} else {
			System.out.println("inv�lido");
		}
		
	}

}
