package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.exececao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	// Main é um metodo executavel em Java
	public static void main(String[] args) {
		try {
			// Se atente para não quebrar estruturas adicionando atributos ou métodos sem
			// necessidade
			lerArquivo();
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticao(new Diretor(login, senha))
					.autenticar()) { /*
										 * Vou travar o contrato para autorizar somente quem realmente tem o contrato
										 * 100 porcento legitimo
										 */

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * É uma lista que dentro dela temos uma chave que identifica uma sequencia de
				 * valores também
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual sua idade?");
					/*
					 * String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
					 * String rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
					 * JOptionPane.showInputDialog("Qual é o CPF?"); String mae =
					 * JOptionPane.showInputDialog("Nome mãe?"); String pai =
					 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
					 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
					 * JOptionPane.showInputDialog("Qual serie"); String escola =
					 * JOptionPane.showInputDialog("Nome da escola");
					 */

					// Aqui será em Java
					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * 
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
							+ " Média " + aluno.getMediaNota());
				}
				System.out.println("----------------------- Lista de Recuperação -----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado do Aluno " + aluno.getNome() + "  = " + aluno.getAlunoAprovado2()
							+ " Média " + aluno.getMediaNota());
				}
				System.out.println("----------------------- Lista de Reprovados -----------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado do Aluno " + aluno.getNome() + "  = " + aluno.getAlunoAprovado2()
							+ " Média " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitidio");
			}
			// Fecha Login
		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			/* Imprime erro no consoole java */
			e.printStackTrace();

			/* Mensagem do erro ou causa */
			System.out.println(" Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				// System.out.println( "Classe de erro : " +
				// e.getStackTrace()[i].getClassName());
				// System.out.println("Método de erro : " +
				// e.getStackTrace()[i].getMethodName());
				// System.out.println("Linha de erro : " +
				// e.getStackTrace()[i].getLineNumber());

				saida.append("\n Classe de erro : " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[i].getLineNumber()); 

			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de número " + saida.toString());

		} catch (NullPointerException e) {

			JOptionPane.showMessageDialog(null, "Opaa um null pointer exception " + e.getClass());

		} catch (ExcecaoProcessarNota e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da excessao customizada inesperado : " + e.getClass().getName());
			 
		} finally {/*Sempre é executado ocorrendo erros ou não*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
		}

	} // Fecha Main
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			
			File fil = new File("line.txt");
			Scanner scanner = new Scanner(fil);
			
		}catch(FileNotFoundException e) {
			
			throw new ExcecaoProcessarNota(e.getMessage());
			
		}

	}

} // Fecha class
