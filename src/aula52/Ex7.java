package aula52;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, valor1 = 0, valor2 = 0;
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			valor = i; 
			System.out.print(valor + " ");
			valor1 = i*i;
			System.out.print(valor1 + " ");
			valor2 = i*i*i;
			System.out.println(valor2);
		}

	}

}
