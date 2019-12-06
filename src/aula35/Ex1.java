package aula35;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int numero = sc.nextInt();
		
		if( numero >= 0 ) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
	}
}
