package lista1;

import java.util.Scanner;

//Exerc�cio 1 - Programa��o Sequencial
//Carolina Mira

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, diasfinal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos anos voc� tem:");
		anos = ler.nextInt();
		
		System.out.println("\nInforme quantos meses se passaram desde seu �ltimo anivers�rio: ");
		meses = ler.nextInt();
		
		System.out.println("\nInforme quantos dias se passaram neste m�s, do dia em que vc nasceu at� hoje: ");
		dias = ler.nextInt();
		
		diasfinal = (anos*365) + (meses*30) + (dias*1);
		System.out.println("\nVoc� j� viveu: " + diasfinal + " dias at� agora. Parab�ns :) " );
		
		ler.close();
			
	}
	
}
