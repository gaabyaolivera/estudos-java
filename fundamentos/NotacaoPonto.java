package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String nome = "Gabriella";
		nome = nome.toUpperCase();
		nome = nome.replace("A", "I");
		nome = nome.concat("!!!");
		//nome = nome.length(); | n�o � poss�vel obter o tamnho pois estamos trabalhando
		//com string
		System.out.println(nome);
		
		// aqui � poss�vel obter o tamnho pois foi criada uma vari�vel do tipo int
		int size = nome.length();
		System.out.println(size);
		
		
		// Tipos primitivos n�o possui a nota��o "."

	}

}
