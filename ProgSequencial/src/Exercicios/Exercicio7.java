package Exercicios;

import java.util.Scanner;

//Exerc�cio 7 - Programa��o Sequencial
//Carolina Mira

public class Exercicio7 {
	
	public static void main(String[] args) {
	
		float vara, varb, varc, vard, vare, varf, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a vari�vel a: ");
		vara = ler.nextFloat();
		
		System.out.println("\nDigite a vari�vel b: ");
		varb = ler.nextFloat();
				
		System.out.println("\nDigite a vari�vel c: ");
		varc = ler.nextFloat();
		
		System.out.println("\nDigite a vari�vel d: ");
		vard = ler.nextFloat();
		
		System.out.println("\nDigite a vari�vel e: ");
		vare = ler.nextFloat();
		
		System.out.println("\nDigite a vari�vel f: ");
		varf = ler.nextFloat();		

		x = (varc*vare) - (varb*varf)/(vara*vare)-(varb*vard);
		y = (vara*varf) - (varc*vard)/(vara*vare)-(varb*vard);
		
		System.out.println("O valor de x �: " + x +" e o valor de y �: "+ y);

		ler.close();
	}

}
