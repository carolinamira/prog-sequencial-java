package Exercicios;

import java.util.Scanner;

//Exercício 8 - Programação Sequencial
//Carolina Mira

public class Exercicio8 {
	
	public static void main(String[] args) {
	
		double custonovo, custofabrica, distribuidor, impostos; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custofabrica = ler.nextFloat();
		
		distribuidor = custofabrica*0.28; 
		impostos = custofabrica*0.45;

		custonovo = custofabrica + distribuidor + impostos;
		System.out.println("O custo do carro novo é: " + custonovo);
		
		ler.close();
	}

}
