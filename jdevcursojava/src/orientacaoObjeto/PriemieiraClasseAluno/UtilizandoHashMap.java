package orientacaoObjeto.PriemieiraClasseAluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class UtilizandoHashMap {
	
	

		
			public static void main(String[] args) {
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				List<Aluno> alunos  = new ArrayList<Aluno>();
				String qtdAlunos = JOptionPane.showInputDialog("Quantos alunos deseja adiconar");
				Integer qtdeAlunos = Integer.valueOf(qtdAlunos).intValue();
				for(int i = 1 ; i <= qtdeAlunos;i++) {
					String nomeAluno = JOptionPane.showInputDialog("nome do aluno");
					String numeroCPF = JOptionPane.showInputDialog("cpf?");
					String nomeMae = JOptionPane.showInputDialog("nome da mae");
					Aluno aluno = new Aluno();
					
					aluno.setNome(nomeAluno);
					aluno.setNumeroCpf(numeroCPF);
					aluno.setNomeMae(nomeMae);
				
					String qtdDisciplina = JOptionPane.showInputDialog("Quantidade de disciplinas para o aluno ?");
					Integer qtdeDisciplinas = Integer.valueOf(qtdDisciplina).intValue();
					
					for(int y = 1 ; y <= qtdeDisciplinas;y++) {
						Disciplina disciplina =new Disciplina();
						String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina");
						String notaDisciplina= JOptionPane.showInputDialog("nota?");
						double nota = Double.valueOf(notaDisciplina).doubleValue();
				        disciplina.setDisciplina(nomeDisciplina);
				        disciplina.setNota(nota);
				        aluno.getDisciplia().add(disciplina);
								}
					alunos.add(aluno);
						} 
			System.out.println(alunos);
				for(Aluno a : alunos) {
					if(a.getNome() == "victor") {
						alunos.remove(a);
					}
				}
				
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				for(Aluno aluno : alunos) {
					if(aluno.Aprovacao(aluno).equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					}
					if(aluno.Aprovacao(aluno).equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
					if(aluno.Aprovacao(aluno).equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
				}
				
				for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("_____________________Alunos Aprovados_______________");
					System.out.println(aluno);
					
				}
				for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("_____________________Alunos Recuperacao_______________");
					System.out.println(aluno);
					
				}
				for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("_____________________Alunos Reprovados_______________");
					System.out.println(aluno);
					
				}


		}


	}



