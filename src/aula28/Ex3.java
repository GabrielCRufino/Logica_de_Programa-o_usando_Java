package aula28;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int diferenca = A * B - C * D;
		
		System.out.println("A diferen�a entre os numeros � de: " + diferenca);
		 
		sc.close();
	}
}
