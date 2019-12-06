package aula35;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora de inicio: ");
		int inicio = sc.nextInt();
		System.out.println("Digite a hora do termino: ");
		int fim = sc.nextInt();
		
		if(inicio > fim) {
			int valor = 24 - inicio + fim; 
			System.out.println("O jogo durou: " + valor);
		} if(inicio == fim) {
			System.out.println("O Jogo durou 24 horas");
		} if(inicio < fim) {
			int valor = fim - inicio;
			System.out.println("O jogo durou: " + valor);
		}
	}

}
