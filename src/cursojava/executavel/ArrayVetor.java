package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notas2 = {7.8, 8.7, 9.6, 6.8};
		
		//Criação dos alunos
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Criação das disciplins
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		
		
		disciplina.setNota(notas);
		
		aluno.getDisciplina().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de programação");
		disciplina2.setNota(notas);
		
		aluno.getDisciplina().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " + aluno.getNomeEscola());
		System.out.println(" ------Disciplina do aluno--------- ");
		
		for (Disciplina d : aluno.getDisciplina()) {
			
			System.out.println(" Disciplina : " + d.getDisciplina());
			System.out.println("A notas da disciplina são");
			
			double notaMax = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
				
				if (pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " e de valor : " + notaMax);
			
		}
		
	}
	
}
