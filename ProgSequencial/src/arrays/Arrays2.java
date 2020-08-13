package arrays;
import java.util.Scanner;

//Exerc�cio 2 - Arrays
//Carolina Mira

public class Arrays2 {
	
	public static void main(String[] args) {
		
		int i, somapares=0, contimpares=0;
		int[] vetor = new int[6];
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		for(i=0; i<6; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.printf("Vetor resultante: {");
		for(i=0; i<6; i++) {
			System.out.printf(" %d ",vetor[i]);
		}
		System.out.printf("}");
		
		System.out.printf("\nN�meros pares: {");
		for(i=0; i<6; i++) {			
			if(vetor[i] % 2 == 0) {
				System.out.printf(" %d ",vetor[i]);	
				somapares = vetor[i] + somapares;
			}
				
		} 
		System.out.printf("}");
		
		System.out.println("\nA soma dos n�meros pares digitados �: " + somapares);
		
		System.out.printf("\nN�meros �mpares: {");
		for(i=0; i<6; i++) {			
			if(vetor[i] % 2 != 0) {
				System.out.printf(" %d ",vetor[i]);	
				contimpares++;
			}
				
		} 
		System.out.printf("}");
		
		System.out.println("\nA quantidade de n�meros �mpares digitados �: " + contimpares);
		
	}

}
