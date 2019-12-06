package ExerciciosComProf;

import java.util.Locale;
import java.util.Scanner;

public class OperadoraTelefone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Informe os minutos consumidos: ");
		int minuto = sc.nextInt();
		
		if(minuto <= 100 && minuto > 0) {
			System.out.println("Valor a cobrar é de: R$ 50,00");
		}else if(minuto > 100 && minuto > 0) {
			double exedente = minuto - 100;
			exedente *= 2.00;
			double total = exedente + 50.00;
			System.out.printf("Valor a pagar é de: R$ %.2f%n", total);
		}else if(minuto <= 0) {
			System.out.println("Minutos inseridos são invalidos");
		}
				
		
		
	}

}
