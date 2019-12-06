package aula52;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, n = 0;
		int dentro = 0, fora = 0;
		
		System.out.println("Informe valor de repetição: ");
		n = sc.nextInt();
		System.out.println("Informe os valores: ");
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				dentro = dentro + 1;
			}else {
				fora = fora + 1;
			}
		}
		System.out.println("No intervalode 10 a 20");
		System.out.println(dentro + " Numeros estão dentro do intevalo");
		System.out.println(fora + " Numeros estão fora do intervalo");		

	}

}
