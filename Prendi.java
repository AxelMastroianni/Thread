package prendi.da.lista;

import java.util.ArrayList;
import java.util.Random;

public class Prendi extends Thread {
	
	private ArrayList<Integer> numeriPresi=new ArrayList<Integer>();
	private ArrayList<Integer> selezionato=new ArrayList<Integer>();
	private Random r=new Random();
	private int contaNumeri=0;
	
	public Prendi(ArrayList<Integer> selezionato) {
		this.selezionato=selezionato;
	}

	@Override
	public void run() {
		while(!selezionato.isEmpty()) {
			System.out.println(getName()+" in esecuzione");
			prendiNumero();
			System.out.println("Io, "+getName()+" ho preso "+contaNumeri+" numeri dall'array");
		}
	}
	/**
	 * Metodo che prende un numero dall'Array.Osservazione: da notare che se ai Thread non si dice di
	 * aspettare questi si prendono il posto dell'altro Thread a piacere generando eccezioni.
	 * Quindi se gli altri Thread non aspettano che uno abbia terminato la sua estrazione
	 * del numero loro si inseriscono di "prepotenza" e prendono un numero, anche lo stesso
	 * creando le eccezioni quando l'altro Thread viene sbloccato siccome va a prendere un 
	 * numero che è già stato rimosso
	 * Per farlo funzionare è stato necessario estrarre il numero indicato dall'indice
	 * rimuovendolo subito, altrimenti gli altri Thread prendevano subito posto
	 * Nonostante ciò bisogna sempre controllare che la lista sia vuota perché appunto
	 * i Thread in questo momento non sono in grado di attendere che uno termini il suo task
	 */
	private void prendiNumero() {
		if(!selezionato.isEmpty()) {//necessario perché altrimenti tenta di estrarre anche a lista vuota
			int indice=Math.abs(r.nextInt(selezionato.size()));
			int numero=selezionato.remove(indice);
			System.out.println("Aggiungo "+numero+" a "+getName());
			numeriPresi.add(numero);
			contaNumeri++;
		}
	}
	
	public int getContaNumeri() {
		return contaNumeri;
	}

}
