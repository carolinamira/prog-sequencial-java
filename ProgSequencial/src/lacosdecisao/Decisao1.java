package lacosdecisao;

import java.util.Scanner;

//Exercício 1 - Laços de decisão
//Carolina Mira

public class Decisao1 {
	
	public static void main(String[] args) {
		
		int num1, num2, num3, maior=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro inteiro: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o valor do segundo inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o valor do terceiro inteiro: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		} else if(num2 > num1 && num2 > num3) {
			maior = num2;
		} else {
			maior = num3;
		}
		
		if(maior == num1) {
			System.out.println("O maior número é o primeiro: " + maior);
		} else if(maior == num2) {
			System.out.println("O maior número é o segundo: " + maior);
		} else{
			System.out.println("O maior número é o terceiro: " + maior);
		}
		
		ler.close();

	}

}
