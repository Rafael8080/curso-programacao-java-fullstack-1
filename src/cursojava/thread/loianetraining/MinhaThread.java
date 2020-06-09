package cursojava.thread.loianetraining;

public class MinhaThread extends Thread{

	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		//Aqui eu chamo o metodo
		start();
	}
	
	//Aqui que a magica acontece
	public void run() {
		
			try {
				for(int i = 0; i<6; i++) {
					System.out.println(nome + "Contador" + i);
				Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
}
