package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
    //Main é um metodo executavel em Java
    public static void main(String[] args) {
    	

    	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
    	String idade = JOptionPane.showInputDialog("Qual sua idade?");
    	String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
    	String rg = JOptionPane.showInputDialog("Registro Geral?");
    	String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
    	String mae = JOptionPane.showInputDialog("Nome mãe?");
    	String pai = JOptionPane.showInputDialog("Nome do pai?");
    	String matricula = JOptionPane.showInputDialog("Data da matricula?");
    	String serie = JOptionPane.showInputDialog("Qual serie");
    	String escola = JOptionPane.showInputDialog("Nome da escola");
    	
    	
    	//Aqui será em Java
    	Aluno aluno1 = new Aluno();
    	aluno1.setNome(nome);
    	aluno1.setIdade(Integer.valueOf(idade));
    	aluno1.setDataNascimento(dataNascimento);
    	aluno1.setRegistroGeral(rg);
    	aluno1.setNumeroCpf(cpf);
    	aluno1.setNomeMae(mae);
    	aluno1.setNomePai(pai);
    	aluno1.setDataMatricula(matricula);
    	aluno1.setSerieMatriculado(serie);
    	aluno1.setNomeEscola(escola);
    	
    	for(int pos = 1; pos <= 4; pos++) {
    		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
    		String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
    		
    		Disciplina disciplina = new Disciplina();
    		disciplina.setDisciplina(nomeDisciplina);
    		disciplina.setNota(Double.valueOf(notaDisciplina));
    		
    		aluno1.getDisciplina().add(disciplina);
    	}
    	
    	int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum disciplina ?");
    	
    	if (escolha == 0) {
    		String discplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
    		aluno1.getDisciplina().remove(Integer.valueOf(discplinaRemover).intValue());
    	}
	
    	System.out.println(aluno1.toString());
    	System.out.println("Média do aluno = " + aluno1.getMediaNota());
    	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
    	

    	
    	

    }

}
