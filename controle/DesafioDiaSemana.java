package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String diaDaSemana = entrada.next();

		
		if(diaDaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if (diaDaSemana.equalsIgnoreCase("ter�a") || diaDaSemana.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if (diaDaSemana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (diaDaSemana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (diaDaSemana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (diaDaSemana.equalsIgnoreCase("s�bado") || diaDaSemana.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Op��o inv�lida!");
		}
		
		entrada.close();
	}

}
