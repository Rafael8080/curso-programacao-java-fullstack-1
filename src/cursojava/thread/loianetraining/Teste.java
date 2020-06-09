package cursojava.thread.loianetraining;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread 1#", 600);
		
		MinhaThread thread2 = new MinhaThread("Thread 2#", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
		//A thread só é iniciada quando chamamos o metodo run, start chama o metodo run
		//thread.start();

	}

}
