package Exercicios;

import java.util.Scanner;

//Exercício 6 - Programação Sequencial
//Carolina Mira

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		float x1, y1, x2, y2;
		double distancia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos calcular a distância entre dois pontos :) Digite o x de seu Ponto 1: ");
		x1 = ler.nextFloat();
		
		System.out.println("\nDigite o y de seu Ponto 1: ");
		y1 = ler.nextFloat();
		
		System.out.println("\nMuito bem! Agora digite o x de seu Ponto 2: ");
		x2 = ler.nextFloat();
		
		System.out.println("\nE digite o y de seu Ponto 2: ");
		y2 = ler.nextFloat();
		
		distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
			
		
		System.out.println("A distância entre os dois pontos é de: " + distancia);

		ler.close();
	}

}
