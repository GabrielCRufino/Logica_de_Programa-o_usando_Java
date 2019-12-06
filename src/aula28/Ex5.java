package aula28;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valorU1 = sc.nextDouble();
		
		double peca1 = numPeca1 * valorU1;
		
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorU2 = sc.nextDouble();
		
		double peca2 = numPeca2 * valorU2;
		
		double ValorP = peca1 + peca2;
		
		System.out.printf("Valor a pagar: R$ %.2f %n", ValorP);
	}

}
