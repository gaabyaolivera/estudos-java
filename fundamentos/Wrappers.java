package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		// wrapper versão orientada a objetos de cada tipo primitivo
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 2000;
		Long l = 20000L;
		Float f = 1500F;
		Double d = 3000.0;
		Character c = 'A'; //char
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

	}

}
