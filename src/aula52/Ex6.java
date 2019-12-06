package aula52;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inforem numero inteiro: ");
		int n = sc.nextInt();
		
		System.out.println("Seus divisores são: ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}	
		
		sc.close();
	}
}
