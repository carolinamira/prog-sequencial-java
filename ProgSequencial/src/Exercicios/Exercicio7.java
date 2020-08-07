package Exercicios;

import java.util.Scanner;

//Exercício 7 - Programação Sequencial
//Carolina Mira

public class Exercicio7 {
	
	public static void main(String[] args) {
	
		float vara, varb, varc, vard, vare, varf, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a variável a: ");
		vara = ler.nextFloat();
		
		System.out.println("\nDigite a variável b: ");
		varb = ler.nextFloat();
				
		System.out.println("\nDigite a variável c: ");
		varc = ler.nextFloat();
		
		System.out.println("\nDigite a variável d: ");
		vard = ler.nextFloat();
		
		System.out.println("\nDigite a variável e: ");
		vare = ler.nextFloat();
		
		System.out.println("\nDigite a variável f: ");
		varf = ler.nextFloat();		

		x = (varc*vare) - (varb*varf)/(vara*vare)-(varb*vard);
		y = (vara*varf) - (varc*vard)/(vara*vare)-(varb*vard);
		
		System.out.println("O valor de x é: " + x +" e o valor de y é: "+ y);

		ler.close();
	}

}
