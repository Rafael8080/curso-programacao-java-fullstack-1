package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		double[] valores = {9.5, 8.9, 5.8};
		String[] values = new String[4];
		String[] valuesString = {"teste", "teste2", "teste3", "teste4", "teste5","teste6"};
		
		values[0] = "Alex";
		values[1] = "90";
		values[2] = "Curso de java";
		values[3] = "contato@jdevtreinamento.com.br";
		
		int[] inteiros = new int[10];
		float[] floats = new float[10]; 
		
		/*Array pode ser de todos os tipos de dados e objetos também*/
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.valueOf(valor);
			
		}
		
		/*Atribuir valor nas posições dos arrays*/

		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + " é = " + notas[i]);
		}
		
		
	}
	
}
