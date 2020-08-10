package lacosdecisao;

import java.util.Scanner;

//Exercício 2 - Laços de decisão
//Carolina Mira

public class Decisao2 {
	
	public static void main(String[] args) {

		int num1, num2, num3, a, b, c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro inteiro: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o valor do segundo inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o valor do terceiro inteiro: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			c = num1;			
			if(num2 > num3) {
				b = num2;
				a = num3;
			}
			else {
				b = num3;
				a = num2;
			}
		
		} else if(num2 > num1 && num2 > num3) {
			c = num2;
			if(num1 > num3) {
				b = num1;
				a = num3;
			}
			else {
				b = num3;
				a = num1;
			}
		} else {
			c = num3;
			if(num1 > num2) {
				b = num1;
				a = num2;				
			} else {
				a = num1;
				b = num2;
			}
		}
		
		System.out.println("A ordem crescente é: " + a + ", " + b + ", " + c + " .");
		ler.close();
	}

}
