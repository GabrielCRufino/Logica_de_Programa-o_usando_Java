package aula47;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a senha de quatro digitos: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida !");
			System.out.println("Tente novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido ^_^ ");
		
		
	}

}
