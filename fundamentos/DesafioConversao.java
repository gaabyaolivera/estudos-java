package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double mediaSalario = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A m�dia do sal�rio nos �ltimos 3 meses: R$%.2f" , mediaSalario);
		
		entrada.close();
	}
}
