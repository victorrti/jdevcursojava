package herancaPolimorfismoInterfaces.heranca;
import javax.swing.JOptionPane;

import herancaPolimorfismoInterfaces.heranca.Aluno;

public class objetosubclasseExecutavel {
   public static void main(String[] args) {
	   
	Aluno aluno = new Aluno();
	aluno.setNome("Victor");
	aluno.setCpf("1");
	aluno.setMatricula(2);
	
	JOptionPane.showMessageDialog(null, aluno.getNome());
	JOptionPane.showMessageDialog(null, aluno.retornaNomeCpf());
	
  }
}
