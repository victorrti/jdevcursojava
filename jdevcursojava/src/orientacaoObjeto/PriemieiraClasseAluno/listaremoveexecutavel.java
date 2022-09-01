package orientacaoObjeto.PriemieiraClasseAluno;

import javax.swing.JOptionPane;

public class listaremoveexecutavel{
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
		int opcao = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina  ?");
		
		if(opcao == 0 ) {
			String disciplinaRemover = JOptionPane.showInputDialog("qual a disciplina1,2,3,4 ?");
			aluno1.getDisciplia().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
		}
		JOptionPane.showMessageDialog(null, aluno1.getDisciplina());
	}
	
	
	
	
}
