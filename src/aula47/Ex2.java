package aula47;

import java.util.Locale;
import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("indique o valor de X e Y: ");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0 ) {
			if(X > 0 && Y > 0) {
				System.out.println("Primeiro");
			}else if(X < 0 && Y > 0) {
				System.out.println("Segundo");
			}else if(X < 0 && Y < 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("quarto");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();
	}

}
