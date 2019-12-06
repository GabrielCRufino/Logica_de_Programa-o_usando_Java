package aula28;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, pi;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		double a, b, c, d, e;
		a = A * C / 2;
		b = (C * C) * pi;
		c = (A + B) * C / 2;
		d = B * B;
		e = A * B;
		
		System.out.printf("Triangulo: %.3f %n", a);
		System.out.printf("Triangulo: %.3f %n", b);
		System.out.printf("Triangulo: %.3f %n", c);
		System.out.printf("Triangulo: %.3f %n", d);
		System.out.printf("Triangulo: %.3f %n", e);
		
	}

}
