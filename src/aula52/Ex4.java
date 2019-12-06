package aula52;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o numer de repetiçoes: ");
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			System.out.println("Informe dois valore: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b != 0) {
				double resultado = (double) a / b;
				System.out.println("resultado da divisão é: " + resultado);
			}else {
				System.out.println("Divisão impossivel");
			}
		}

		System.out.println("Fim do Programa, valeu");
	}

}
