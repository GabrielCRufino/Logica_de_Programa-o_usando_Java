package aula35;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Valor: ");
		
		
		int number = sc.nextInt();
		
		if( number % 2 ==  0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
