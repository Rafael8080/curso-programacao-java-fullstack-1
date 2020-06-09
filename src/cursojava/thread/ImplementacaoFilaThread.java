package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		while(true) {
			
			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) { /*Bloquear o acesso e esta lista por outros processos*/
				
				while (iteracao.hasNext()) { /* Enquanto conter dados na lista irá processar */
					
					/*
					 * Aqui a gente faz um cast pra um objetoFilaThread, pois ele é um objeto comun(Object).
					 * coisa do java
					 */
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /* Pegar o objeto atual */
					
					/* Processar 10 mil notas fiscais */
					/* Gerar uma lista enorme de PDF */
					/* Gerar envio em massa de email */
					
					System.out.println("------------------------------------");
					System.out.println(processar.getName());
					System.out.println(processar.getEmail());
					
					iteracao.remove();
					
					try {
						Thread.sleep(1000);// Tempo pra descarga de memoria
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				} //Fecha while
				try {
					Thread.sleep(1000);/* Processou toda a lista dá um tempo pra limpesa de memoria */
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} //Fecha synchronized
		}


	}


}
