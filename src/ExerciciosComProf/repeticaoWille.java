package ExerciciosComProf;

import java.util.Locale;
import java.util.Scanner;

public class repeticaoWille {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt(); 
		}
		System.out.println(soma);
		sc.close();
	}

}
