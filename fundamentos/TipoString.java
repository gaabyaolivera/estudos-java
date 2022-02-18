package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol�".charAt(2));
		
		String a = "Joanny";
		boolean aa = a.equals("joanny");
		System.out.println("� igual? " + aa);
		
		//n�o leva em considera��o as letras mai�sculas e min�sculas
		aa = a.equalsIgnoreCase("joanny");
		System.out.println("ignore case: " + aa);
		
		boolean b = a.startsWith("Jo");
		System.out.println("come�a com? " + b);
		
		b = a.endsWith("y");
		System.out.println("termina com? " + b);
		

		var nome = "Pedro";
		var sobrenome = "Arruda";
		var salario = 1550.78;
		var idade = 44;
		
		System.out.printf("O funcion�rio %s %s ganha R$%.2f e tem %d anos.", nome, sobrenome, salario, idade);
		
		//String.format() faz o mesmo que o printf
	}

}
