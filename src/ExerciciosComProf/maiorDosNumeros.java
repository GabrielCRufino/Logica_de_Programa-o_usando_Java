package ExerciciosComProf;

import java.util.Scanner;

public class maiorDosNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Escolha 3 numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.println("O maior valor é: ");
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}else if(n2>n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}
	}

}
