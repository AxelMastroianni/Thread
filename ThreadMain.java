package primi.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadHentai th1=new ThreadHentai();
		th1.setName("Thread Hentai 1");
		
		ThreadHentai th2=new ThreadHentai();
		th2.setName("Thread Hentai 2");
		
		ThreadHentai th3=new ThreadHentai();
		th3.setName("Thread Hentai 3");
		
		ThreadHentai th4=new ThreadHentai();
		th4.setName("Thread Hentai 4");
		
		ThreadHentai th5=new ThreadHentai();
		th5.setName("Thread Hentai 5");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();

	}

}
