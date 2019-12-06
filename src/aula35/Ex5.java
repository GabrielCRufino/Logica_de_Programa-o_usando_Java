package aula35;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod, quant;
		double total = 0;
		
		System.out.println("Digite o codigo do produto: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantida desejada: ");
		quant = sc.nextInt();
		
		if(cod == 1) {
			total = 4 * quant;
		}else if (cod == 2) {
			total = 4.5 * quant;
		}	
		 else if(cod == 3) {
			total = 5 * quant;
		} else if(cod == 4) {
			total = 2 * quant;
		} else if(cod == 5) {
			total = 1.5 * quant;
		} 
		System.out.printf("Total de: R$ %.2f%n", total);
	
	}
}
