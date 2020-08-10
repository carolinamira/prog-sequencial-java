package lacosdecisao;

import java.util.Scanner;

//Exerc�cio 3 - La�os de decis�o
//Carolina Mira

public class Decisao3 {
	
	public static void main(String[] args) {

		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a idade para saber a categoria: ");
		idade = ler.nextInt();
		
		if(0 <= idade && idade < 10) {			
			System.out.println("O competidor ainda � muito novo, n�o possui categoria.");			
		} else if(10 <= idade && idade <= 14) {
			System.out.println("O competidor est� na categoria infantil.");
		}
		else if(15 <= idade && idade <= 17) {
			System.out.println("O competidor est� na categoria juvenil.");
		}
		else if(18 <= idade && idade <= 25) {
			System.out.println("O competidor est� na categoria adulto.");
		}
		else {
			System.out.println("O competidor passou da idade permitida e n�o pode mais competir.");
		}
		
		ler.close();
	}

}
