package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
			
		/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
		
		for (int pos = 0; pos < 10; pos++) {
			
			System.out.println("Executando algo rotina, por exemplo envio de e-mail");
			Thread.sleep(1000);	/*Dá um tempo no código*/
			
		}
		
	}
	
}
