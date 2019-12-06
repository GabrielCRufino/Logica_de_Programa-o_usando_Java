package aula28;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorH = sc.nextDouble();
		
		double salario = valorH * horas;
		
		System.out.println("O numero do Funcionario é: " + numero);
		System.out.printf("O valor do seu sálario é de: %.2f%n", salario);
		
		sc.close();
	}

}
