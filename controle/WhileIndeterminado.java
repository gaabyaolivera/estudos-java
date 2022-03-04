package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String laco = "start";
		
		while(!laco.equalsIgnoreCase("exit")) {
			System.out.println("sua resposta é: " + laco);
			laco = entrada.nextLine();
		}
		entrada.close();
	}

}
