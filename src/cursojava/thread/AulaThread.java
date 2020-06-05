package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*Thread processando em paralelo do envio de nota fiscal */
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		/*C�DIGO DO SISTEMA DO USU�RIO CONTINUA O FLUXO DE TRABALHO*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
		
		/*Fluxo do sistema, cadastro de venda, um emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o �suario");
		
	}
	
	
	
	private static Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			/*C�digo da rotina aqui*/
			/*Codigo da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando algo rotina, por exemplo envio de email");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	/*D� um tempo no c�digo*/
				
			}
			/*Fim do codigo em paralelio*/
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*C�digo da rotina aqui*/
			/*Codigo da rotina que eu quero executar em paralelo*/
			for (int pos = 0; pos < 10; pos++) {
				
				System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	/*D� um tempo no c�digo*/
				
			}
			/*Fim do codigo em paralelio*/
		}
		
	};
	
}
