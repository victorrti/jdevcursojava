package orientacaoObjeto.PriemieiraClasseAluno;

import java.util.Objects;
import orientacaoObjeto.PriemieiraClasseAluno.Disciplina;
public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
    private String nomePai;
	private String dataMatricula;
	private String serieMatriculaddo;
	
	private Disciplina disciplina = new Disciplina();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getSerieMatriculaddo() {
		return serieMatriculaddo;
	}
	public void setSerieMatriculaddo(String serieMatriculaddo) {
		this.serieMatriculaddo = serieMatriculaddo;
	} 
	
	

	public Aluno() {		
	}
	public Aluno(String nomeMae, String nomePai,String nome) {		
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.nome = nome;
	}
	
	public Aluno(String nome) {	
		
		this.nome = nome;
	}
	public double getMediaNota() {
		return ((disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4())/4);
	}
	
	public boolean getAlunoAprovado() {
		double media  = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	// equals e hashcode
	
	

}
