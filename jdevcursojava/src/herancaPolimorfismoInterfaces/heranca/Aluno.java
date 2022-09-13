package herancaPolimorfismoInterfaces.heranca;

import java.util.List;

public class Aluno extends Pessoa{
  private Integer matricula;
  private List<Disciplina> disciplina;
  
  public Integer getMatricula() {
	return matricula;
  }

	public Aluno(String nome) {
		super.nome = nome;
		
	}
	public Aluno() {
		
		
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}	
   
	@Override
	public String retornaNomeCpf() {
		return this.getNome() + this.getCpf() + this.getMatricula();
	}
  
}
