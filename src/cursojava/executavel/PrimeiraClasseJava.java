package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
    //Main é um metodo executavel em Java
    public static void main(String[] args) {
    	
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	
    	for (int qtd = 1; qtd <= 2; qtd++) {
    		
    	

    	String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+ qtd +" ?");
    	/*
	    	String idade = JOptionPane.showInputDialog("Qual sua idade?");
	    	String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
	    	String rg = JOptionPane.showInputDialog("Registro Geral?");
	    	String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
	    	String mae = JOptionPane.showInputDialog("Nome mãe?");
	    	String pai = JOptionPane.showInputDialog("Nome do pai?");
	    	String matricula = JOptionPane.showInputDialog("Data da matricula?");
	    	String serie = JOptionPane.showInputDialog("Qual serie");
	    	String escola = JOptionPane.showInputDialog("Nome da escola");
    	*/
    	
    	
    	//Aqui será em Java
    	Aluno aluno1 = new Aluno();
    	aluno1.setNome(nome);
    	/*
	    	aluno1.setIdade(Integer.valueOf(idade));
	    	aluno1.setDataNascimento(dataNascimento);
	    	aluno1.setRegistroGeral(rg);
	    	aluno1.setNumeroCpf(cpf);
	    	aluno1.setNomeMae(mae);
	    	aluno1.setNomePai(pai);
	    	aluno1.setDataMatricula(matricula);
	    	aluno1.setSerieMatriculado(serie);
	    	aluno1.setNomeEscola(escola);
    	*/
    	
    	for(int pos = 1; pos <= 4; pos++) {
    		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
    		String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
    		
    		Disciplina disciplina = new Disciplina();
    		disciplina.setDisciplina(nomeDisciplina);
    		disciplina.setNota(Double.valueOf(notaDisciplina));
    		
    		aluno1.getDisciplina().add(disciplina);
    		System.out.println("ANTESSSSSS" + aluno1.getDisciplina());
    	}
    	
    	int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum disciplina ?");
    	
    	if (escolha == 0) {
    		
    		int continuarRemover = 0;
    		int posicao = 1;
    		while (continuarRemover == 0) {
        		String discplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
        		aluno1.getDisciplina().remove(Integer.valueOf(discplinaRemover).intValue() - posicao);
        		posicao++;
        		continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
    		}
    		
    	}
    	
    	alunos.add(aluno1);
    	}
    	
    	for (Aluno aluno : alunos) {
    		
    		if(aluno.getNome().equalsIgnoreCase("Alex") ) {
    			alunos.remove(aluno);
            	break;
            	
    		} else {
        		System.out.println(aluno);
            	System.out.println("Média do aluno = " + aluno.getMediaNota());
            	System.out.println("Resultado = " + (aluno.getAlunoAprovado2()));
            	System.out.println("-------------------");
    		}
    		
		}
    	
    	for (Aluno aluno: alunos) {
    		System.out.println("Aluno que sobraram na lista");
    		System.out.println(aluno.getNome());
    		System.out.println("Suas materias são");
    		
    		for (Disciplina disciplina : aluno.getDisciplina()) {
    			System.out.println(disciplina.getDisciplina());
    		}
    	}
    	

    	

    	
    	

    }

}
