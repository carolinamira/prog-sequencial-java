package lacosrepeticao;

import java.util.Scanner;

//Exerc�cio 2 - La�os de repeti��o
//Carolina Mira

public class Repeticao2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int x, numero, par=0, impar=0;
		Scanner entrada = new Scanner(System.in);

		for(x=0; x<10; x++) {
			
			System.out.println("Digite o n�mero "+ (x+1) +": ");
			numero = entrada.nextInt();
			
			if(numero%2 == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println("Voc� digitou " + par + " n�meros pares, e " + impar + " n�meros �mpares.");
		
	}
}
