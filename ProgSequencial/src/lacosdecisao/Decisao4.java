package lacosdecisao;

import java.util.Scanner;

//Exerc�cio 4 - La�os de decis�o
//Carolina Mira

public class Decisao4 {
	
	public static void main(String[] args) {

		double numero, raiz, potencia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextFloat();
		
		if(numero%2 == 0) {		
			raiz = Math.sqrt(numero);
			System.out.println("O n�mero � par, e sua raiz quadrada �: " + raiz);			
		} else{
			potencia = Math.pow(numero, 2);
			System.out.println("O n�mero � �mpar, e seu valor ao quadrado �: " + potencia);
		}
		
		ler.close();
	}

}
