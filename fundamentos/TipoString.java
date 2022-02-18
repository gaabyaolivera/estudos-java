package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá".charAt(2));
		
		String a = "Joanny";
		boolean aa = a.equals("joanny");
		System.out.println("é igual? " + aa);
		
		//não leva em consideração as letras maiúsculas e minúsculas
		aa = a.equalsIgnoreCase("joanny");
		System.out.println("ignore case: " + aa);
		
		boolean b = a.startsWith("Jo");
		System.out.println("começa com? " + b);
		
		b = a.endsWith("y");
		System.out.println("termina com? " + b);
		

		var nome = "Pedro";
		var sobrenome = "Arruda";
		var salario = 1550.78;
		var idade = 44;
		
		System.out.printf("O funcionário %s %s ganha R$%.2f e tem %d anos.", nome, sobrenome, salario, idade);
		
		//String.format() faz o mesmo que o printf
	}

}
