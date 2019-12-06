package aula28;

import java.util.Locale;
import java.util.Scanner;

public class Ex5_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double peca1;
		double peca2;
		
		for (int i = 1; i < 3; i++) {
			
			int codPeca = sc.nextInt();
			int numPeca = sc.nextInt();
			double valorU = sc.nextDouble();
	
			if(i == 1) {
				peca1 = numPeca * valorU;
			} else{
				peca2 = numPeca * valorU;
			}
		}
//		double ValorP = peca1 + peca2;
		
//		System.out.printf("Valor a pagar: R$ %.2f %n", ValorP);

	}

}
