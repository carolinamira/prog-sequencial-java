package lista1;

import java.util.Scanner;

//Exercício 1 - Programação Sequencial
//Carolina Mira

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasfinal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos anos você tem:");
		anos = ler.nextInt();
		
		System.out.println("\nInforme quantos meses se passaram desde seu último aniversário: ");
		meses = ler.nextInt();
		
		System.out.println("\nInforme quantos dias se passaram neste mês, do dia em que vc nasceu até hoje: ");
		dias = ler.nextInt();
		
		diasfinal = (anos*365) + (meses*30) + (dias*1);
		System.out.println("\nVocê já viveu: " + diasfinal + " dias até agora. Parabéns :) " );
		
		ler.close();
			
	}
	
}
