package arrays;

//Exercício 1 - Arrays
//Carolina Mira

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int[] A = {1, 0, 5, -2, -5, 7};
		int variavel = A[0] + A[1] + A[5];
		int i;
		
		System.out.println("A soma é igual a " + variavel + ".");
		A[4] = 100;
		
		System.out.println("\nVetor A:");
		for(i=0; i<6; i++) {
			
			System.out.println(A[i]);
			
		}
		
	}

}
