package lacosdecisao;

import java.util.Scanner;

//Exercício 4 - Laços de decisão
//Carolina Mira

public class Decisao4 {
	
	public static void main(String[] args) {

		double numero, raiz, potencia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextFloat();
		
		if(numero%2 == 0) {		
			raiz = Math.sqrt(numero);
			System.out.println("O número é par, e sua raiz quadrada é: " + raiz);			
		} else{
			potencia = Math.pow(numero, 2);
			System.out.println("O número é ímpar, e seu valor ao quadrado é: " + potencia);
		}
		
		ler.close();
	}

}
