package Exercicios;

import java.util.Scanner;

//Exerc�cio 5 - Programa��o Sequencial
//Carolina Mira

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, mediap;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota:");
		nota1 = ler.nextFloat();
		
		System.out.println("Insira a segunda nota:");
		nota2 = ler.nextFloat();
		
		System.out.println("Insira a terceira nota:");
		nota3 = ler.nextFloat();
		
		mediap = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.println("A m�dia ponderada �: " + mediap);

		ler.close();

	}

}
