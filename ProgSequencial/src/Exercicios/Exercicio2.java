package Exercicios;

import java.util.Scanner;

//Exerc�cio 2 - Programa��o Sequencial
//Carolina Mira

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int diasvida, anos, meses, dias;
		System.out.println("Insira o n�mero de dias que vc viveu at� hoje:");
		Scanner ler = new Scanner(System.in);
		diasvida = ler.nextInt();

		anos = diasvida/365;
		meses = (diasvida%365)/30;
		dias = (diasvida%365)%30;

		System.out.println("Voc� tem "+ anos + " anos, " + meses + " meses, e " + dias + " dias. Parab�ns :) ");
		ler.close();

	}

}
