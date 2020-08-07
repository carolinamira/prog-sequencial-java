package Exercicios;

import java.util.Scanner;

//Exercício 2 - Programação Sequencial
//Carolina Mira

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int diasvida, anos, meses, dias;
		System.out.println("Insira o número de dias que vc viveu até hoje:");
		Scanner ler = new Scanner(System.in);
		diasvida = ler.nextInt();

		anos = diasvida/365;
		meses = (diasvida%365)/30;
		dias = (diasvida%365)%30;

		System.out.println("Você tem "+ anos + " anos, " + meses + " meses, e " + dias + " dias. Parabéns :) ");
		ler.close();

	}

}
