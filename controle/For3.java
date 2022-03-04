package controle;

public class For3 {

	public static void main(String[] args) {
		
		// atenção ao escopo!
//		int i = 0;
//		
//		for(; i < 9; i++) {
//			System.out.println(i);
//		}
//
//		System.out.println("Fim...");
//		System.out.println(i);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
	}
	
	

}
