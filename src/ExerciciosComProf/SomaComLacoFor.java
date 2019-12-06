package ExerciciosComProf;

import java.util.Scanner;

public class SomaComLacoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas repetiçoes? ");
		int N = sc.nextInt();
		
		int soma = 0;
		System.out.println("Escolha " + N + " valores para somar: ");
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
