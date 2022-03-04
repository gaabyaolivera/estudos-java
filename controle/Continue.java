package controle;

public class Continue {

	public static void main(String[] args) {
		
		// o continue interrompe apenas a iteração e continua - evitar
		// o break sai do laço - evitar
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) { // vai ignorar o 5
				continue;
			}
			System.out.println(i);
		}

	}

}
