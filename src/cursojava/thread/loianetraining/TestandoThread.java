package cursojava.thread.loianetraining;

public class TestandoThread {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		//Thread t1 = new Thread(thread1);
		//t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1000);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 2000);
		

	}

}
