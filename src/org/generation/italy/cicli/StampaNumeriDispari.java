package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		//Init import
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		
		//Stampa inziale
		System.out.println("Quanti numeri vuoi prendere in considerazione? ");
		
		//Variabili
		int lunghezza = scanner.nextInt();
		int[] n = new int [lunghezza];
		int dispari = 0;
		int pari = 0;
		int somma = 0;
		
		//Ciclo
		for(int i = 0; i < n.length; i++) {
			n[i] = rd.nextInt(99-0) + 0;
			if((n[i] > 10 ) && (n[i] < 50)) {
				somma = somma + n[i]; 
			}
			if(n[i] % 2 == 1) {
			System.out.println(n[i]);
			dispari = dispari +1; //dispari++
			} else if (n[i] % 2 == 0) {
			//	System.out.println(n[i]); per verifica dei numeri compresi tra 10 e 50
				pari = pari +1; //pari++
			}
		}
		
		//Stampa finale
		System.out.println("I numeri dispari trovati sono: " + dispari + "\n" + "I numeri pari trovati sono: " + pari + "\n" + "La somma dei numeri compresi tra 10 e 50 è: " + somma);
		System.out.println();
		System.out.println();

		//Closing scanner
		scanner.close();		                
	}
}
