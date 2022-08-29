package orientacaoObjeto.PriemieiraClasseAluno;

import javax.swing.JOptionPane;

public class ListaDinamicaDisciplinaExecutavel {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		String numeroDisciplinas = JOptionPane.showInputDialog("informe a quantidade de disciplinas:");
		int nDisciplinas =  Integer.parseInt(numeroDisciplinas);
		
		for(int i = 1; i <= nDisciplinas; i++){
			String nomeDisciplinas = JOptionPane.showInputDialog("Nome da disciplina:");
			String notaDisciplinas = JOptionPane.showInputDialog("Nota da disciplina:");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplinas);
			disciplina.setNota(Double.valueOf(notaDisciplinas));
			
			aluno1.getDisciplia().add(disciplina);
			
		}
		
		JOptionPane.showMessageDialog(null, aluno1.getMedia(aluno1.getDisciplia()));
	}
}
