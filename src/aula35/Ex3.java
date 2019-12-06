package aula35;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1 valor: ");
		int number1 = sc.nextInt();
		System.out.println("Digite o 2 valor: ");
		int number2 = sc.nextInt();
		
		System.out.println();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Eles são multiplos");
		}else {
			System.out.println("Eles não são multiplos");
		}
		
		
	}

}
