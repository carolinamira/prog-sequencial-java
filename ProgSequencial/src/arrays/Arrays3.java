package arrays;
import java.util.Scanner;

//Exercício 3 - Arrays
//Carolina Mira

public class Arrays3 {
	
	public static void main(String[] args) {
		
		int i,j, contmaiores=0;
		int[][] matriz = new int[3][3];

		Scanner entrada = new Scanner(System.in);
		
		//leitura dos valores para a matriz
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
			System.out.printf("Digite o elemento M[%d][%d]: ", i+1, j+1);
			matriz[i][j] = entrada.nextInt();			
			if(matriz[i][j] > 10) {
				contmaiores++;
			}
		}
	}
		//exibindo a matriz resultante
		System.out.println("\nMatriz resultante:");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
			System.out.printf(" %d ", matriz[i][j]);
			
			}
			System.out.println("");
		}
		
		System.out.println("\nA matriz possui " + contmaiores + " valores maiores que 10.");		
	}

}
