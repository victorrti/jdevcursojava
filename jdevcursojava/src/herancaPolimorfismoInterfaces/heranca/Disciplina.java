package herancaPolimorfismoInterfaces.heranca;

import java.util.List;

public class Disciplina {
   public String Nome;
   public Double nota;
   public List<Aluno> alunos;
   
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public Double getNota() {
	return nota;
}
public void setNota(Double nota) {
	this.nota = nota;
}
public List<Aluno> getAlunos() {
	return alunos;
}
public void setAlunos(List<Aluno> alunos) {
	this.alunos = alunos;
}
   
   
}
