package lacosdecisao;

import java.util.Scanner;

//Exerc�cio 1 - La�os de decis�o
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
			System.out.println("O maior n�mero � o primeiro: " + maior);
		} else if(maior == num2) {
			System.out.println("O maior n�mero � o segundo: " + maior);
		} else{
			System.out.println("O maior n�mero � o terceiro: " + maior);
		}
		
		ler.close();

	}

}
