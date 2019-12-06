package aula35;


import java.util.Locale;
import java.util.Scanner;


public class Ex7 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1 valor: ");
		double X = sc.nextDouble();
		
		System.out.println("Digite o 2 valor: ");
		double Y = sc.nextDouble();
		
		if(X > 0.0) {
			if(Y < 0.0){
				System.out.println("Q4");
			}else {
				System.out.println("Q1");
			}	
		} else if(X < 0.0) {
			if(Y < 0.0) {
				System.out.println("Q3");
			}else {
				System.out.println("Q2");
			}
		} else if(X == 0.0 && Y != 0.0) {
				System.out.println("Está no Eixo X");
		} else if(Y == 0.0 && X != 0.0) {
				System.out.println("Esta no Eixo Y");
		}else if(X == 0.0 && Y == 0.0) {
			System.out.println("Origem");
		}
		
		
	}
}












