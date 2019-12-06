package ExerciciosComProf;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusParaFahrenhit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char r;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.println("Deseja repetir? s ou n");
			r = sc.next().charAt(0);
		} while( r == 's' );
		
		System.out.println("Fim do progrma, falouu");
	}

}
