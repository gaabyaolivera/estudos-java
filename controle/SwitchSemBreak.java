package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
			
		//sem o break ele mostra todos que estão abaixo da opção selecionada
		case "preta":
			System.out.println("faixa preta");
		case "marrom":
			System.out.println("faixa marrom");
		default:
			System.out.println("Não sei nada");
		}

	}

}
