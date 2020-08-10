package lista1;

import java.util.Scanner;

//Exercício 3 - Programação Sequencial
//Carolina Mira

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int segundosevento, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		segundosevento = ler.nextInt();
		
		horas = (segundosevento/3600);
		minutos = (segundosevento%3600)/60;
		segundos = (segundosevento%3600)%60;
		
		System.out.println("O evento durou até agora " + horas +" horas, "+ minutos +" minutos, e " + segundos + " segundos.");
		
		ler.close();
	}
	
}

