package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Calcular a média das notas de uma turma
		 * nota válida = 10 a 0
		 * armazenar o valor da nota em uma variável chamada total e somar
		 * criar uma variável para armazenar quantas notas válidas foram digitadas
		 * mostrar a média
		 * para sair do programa o usuário deve digitar -1
		 * 
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double notaTotal = 0;
		int notasValidas = 0;
		
			while(total != -1) {
				
				System.out.println("Nota: ");
				total = entrada.nextDouble();
				
				if (total <= 10 && total >= 0) {
					notaTotal += total; // notaTotal = notaTotal + total;
					notasValidas++;
				}
			}
			
		System.out.println("Média do aluno(a): " + notaTotal / notasValidas);
		System.out.println("Notas válidas: " + notasValidas);
		
		entrada.close();
	}

}
