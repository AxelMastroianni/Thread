package primi.thread;

public class ThreadHentai extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Sono il Thread "+getName());
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Io, Thread "+getName()+" ho terminato il mio compito");
	}

}
