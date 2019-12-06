package aula52;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor maximo: ");
		int X = sc.nextInt();
		if(1<= X && X <=1000) {
			System.out.println("Os valores impares até "+ X + " são: ");
			for(int i=1; i<X; i = i +2) {
				System.out.println(i);
			}
		}else {
			System.out.println("Valor invalido");
		}

	}

}
