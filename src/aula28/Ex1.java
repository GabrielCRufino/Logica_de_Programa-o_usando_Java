package aula28;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int resultado = number1 + number2;
		
		System.out.println("A soma é igual a: " + resultado);
		System.out.println();
		sc.close();
	}
}
