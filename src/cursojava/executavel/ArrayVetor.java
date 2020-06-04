package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notas2 = {7.8, 8.7, 9.6, 6.8};
		
		//Cria��o dos alunos
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Cria��o das disciplins
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplina().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programa��o");
		disciplina2.setNota(notas);
		
		aluno.getDisciplina().add(disciplina2);
		
		//------------------
		
		Aluno aluno2 = new Aluno();
		aluno.setNome("Alex Fernando Egidio 2");
		aluno.setNomeEscola("JDEV Treinamento 2");
		
		//Cria��o das disciplins
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java 3");
		disciplina3.setNota(notas);
		
		aluno.getDisciplina().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica de programa��o 3");
		disciplina4.setNota(notas);
		
		aluno.getDisciplina().add(disciplina4);
		
		
		
		//-----------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplina()) {
				
				System.out.println("Nome da disciplina � : " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					
					System.out.println("A nota n�mero :" + posnota + " � Igual = " + d.getNota()[posnota]);
					
				}
				
			}
			
		}
		
	}
	
}
