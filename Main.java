package mia.concorrenza;


public class Main {
	
	public static void main(String[] args) {
		try {
			InserisciNumeri in1=new InserisciNumeri();
			InserisciNumeri in2=new InserisciNumeri();
			in1.start();
			in2.start();
			in1.join();//necessario perch� altrimenti stampa subito che hanno terminato anche se non � vero
			in2.join();
			System.out.println(in1.getName()+" ha terminato");
			System.out.println(in2.getName()+" ha terminato");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
