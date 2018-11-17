package mia.concorrenza;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class InserisciNumeri extends Thread {
	
	private static final String MESSAGGIO = "Inserisci un numero, 0 per terminare: ";
	private SortedSet<Integer> set=new TreeSet<Integer>();
	
	public void run(){
		Scanner tastiera = new Scanner(System.in);
		int numero=-1;
		while(numero!=0) {
			System.out.println(MESSAGGIO);
			try {
			numero=tastiera.nextInt();
			controllaInput(numero);
			set.add(numero);
			System.out.println("Numero "+numero+" aggiunto a "+getName());
			}catch(InputMismatchException e) {
				System.out.println("Input Errato, riprova");
				run();
			}catch(NumberZeroException e) {
				break;
			}
		}
		stampaLista();
	}
	
	private void stampaLista() {
		System.out.println("Stampo "+getName());
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
	
	private void controllaInput(int numero) throws NumberZeroException {
		if(numero==0) {
			throw new NumberZeroException();
		}
	}

}
