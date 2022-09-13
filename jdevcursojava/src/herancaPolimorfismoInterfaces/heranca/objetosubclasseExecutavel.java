package herancaPolimorfismoInterfaces.heranca;
import javax.swing.JOptionPane;

import herancaPolimorfismoInterfaces.heranca.Aluno;

public class objetosubclasseExecutavel {
   public static void main(String[] args) {
	   
	Aluno aluno = new Aluno();
	aluno.setNome("Victor");
	
	JOptionPane.showMessageDialog(null, aluno.getNome());
	
  }
}
