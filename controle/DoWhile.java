package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
		
		do {
			System.out.println("Que os jogos comecem...");
			text = entrada.nextLine();
		} while(!text.equalsIgnoreCase("exit"));
		
		entrada.close();
	}
}
