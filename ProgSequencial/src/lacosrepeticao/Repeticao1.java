package lacosrepeticao;

//Exerc�cio 1 - La�os de repeti��o
//Carolina Mira

public class Repeticao1 {
	
	public static void main(String[] args) {
		
		int x;
		System.out.println("N�meros de 1000 a 1999 que divididos por 11 possuem resto igual a 5: \n");
		
		for(x=1000; x<=1999; x++ ) {
			
			if(x%11 == 5) {
				System.out.println(x);
			} 
		}
	}

}
