package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	// Main � um metodo executavel em Java
	public static void main(String[] args) {
		
		//Se atente para n�o quebrar estruturas adicionando atributos ou m�todos sem necessidade
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		/*Se true acessa se false n�o acessa*/
		if (permitirAcesso.autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * � uma lista que dentro dela temos uma chave que identifica uma sequencia de
			 * valores tamb�m
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 5; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
				/*
				 * String idade = JOptionPane.showInputDialog("Qual sua idade?"); String
				 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
				 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
				 * JOptionPane.showInputDialog("Qual � o CPF?"); String mae =
				 * JOptionPane.showInputDialog("Nome m�e?"); String pai =
				 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
				 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
				 * JOptionPane.showInputDialog("Qual serie"); String escola =
				 * JOptionPane.showInputDialog("Nome da escola");
				 */

				// Aqui ser� em Java
				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
				 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
				 * aluno1.setNomeEscola(escola);
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplina().add(disciplina);
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

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {/* Separado em Lista */

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}
			System.out.println(" Lista das Listas " + maps);

			System.out.println("----------------------- Lista de Aprovados -----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado do Aluno " + aluno.getNome() + "  = " + aluno.getAlunoAprovado2()
						+ " M�dia " + aluno.getMediaNota());
			}
			System.out.println("----------------------- Lista de Recupera��o -----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado do Aluno " + aluno.getNome() + "  = " + aluno.getAlunoAprovado2()
						+ " M�dia " + aluno.getMediaNota());
			}
			System.out.println("----------------------- Lista de Reprovados -----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado do Aluno " + aluno.getNome() + "  = " + aluno.getAlunoAprovado2()
						+ " M�dia " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso n�o permitidio");
		}
		//Fecha Login

	} // Fecha Main

} // Fecha class
