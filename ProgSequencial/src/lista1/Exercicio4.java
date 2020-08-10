package lista1;

import java.util.Scanner;

//Exercício 4 - Programação Sequencial
//Carolina Mira

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		double d, r, s;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = ler.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = (r+s)/2;

		System.out.println("O valor final é: " + d);
		ler.close();

	}

}
