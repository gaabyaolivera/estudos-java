package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Calcular a m�dia das notas de uma turma
		 * nota v�lida = 10 a 0
		 * armazenar o valor da nota em uma vari�vel chamada total e somar
		 * criar uma vari�vel para armazenar quantas notas v�lidas foram digitadas
		 * mostrar a m�dia
		 * para sair do programa o usu�rio deve digitar -1
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
			
		System.out.println("M�dia do aluno(a): " + notaTotal / notasValidas);
		System.out.println("Notas v�lidas: " + notasValidas);
		
		entrada.close();
	}

}
