package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

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
    	
    	String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
    	String nota1 = JOptionPane.showInputDialog("Nota 1");
    	
    	String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
    	String nota2 = JOptionPane.showInputDialog("Nota 2");
    	
    	String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
    	String nota3 = JOptionPane.showInputDialog("Nota 3");
    	
    	String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
    	String nota4 = JOptionPane.showInputDialog("Nota 4");
    	
    	
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
    	
    	aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
    	aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
    	aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
    	aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
    	
    	aluno1.getDisciplina().setDisciplina1(disciplina1);
    	aluno1.getDisciplina().setDisciplina2(disciplina2);
    	aluno1.getDisciplina().setDisciplina3(disciplina3);
    	aluno1.getDisciplina().setDisciplina4(disciplina4);
    	
    	
    	System.out.println(aluno1.toString());
    	System.out.println("Média do aluno = " + aluno1.getMediaNota());
    	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
    	
    	/*Aluno aluno1 = new Aluno();
    	aluno1.setNome("Alex");
    	aluno1.setNumeroCpf("123");
    	
    	Aluno aluno2 = new Aluno();
    	aluno2.setNome("Alex");
    	aluno2.setNumeroCpf("1234");
    	
    	if (aluno1.equals(aluno2)) {
    		System.out.println("Alunos são iguais");
    	} else {
    		System.out.println("Alunos não são iguais");
    	}
    	*/

    	
    	

    }

}
