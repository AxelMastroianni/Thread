package prendi.da.lista;

import java.util.ArrayList;

public class PrendiMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> selezionato=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			selezionato.add(i);
		
		Prendi p1=new Prendi(selezionato);
		p1.setName("Thread 1");
		
		Prendi p2=new Prendi(selezionato);
		p2.setName("Thread 2");
		
		Prendi p3=new Prendi(selezionato);
		p3.setName("Thread 3");
		
		p1.start();
		p2.start();
		p3.start();

	}

}
