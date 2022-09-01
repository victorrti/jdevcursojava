package orientacaoObjeto.PriemieiraClasseAluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AdicionarAlunosListaExecutavel {
	public static void main(String[] args) {
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
		}

}
