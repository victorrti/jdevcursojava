package orientacaoObjeto.PriemieiraClasseAluno;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
    private double nota;
    private double nota1;
    private double nota2;
    private double nota3;
    private String nomePai;
	private String dataMatricula;
	private String serieMatriculaddo;
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nota=" + nota + ", nota1="
				+ nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", serieMatriculaddo=" + serieMatriculaddo + "]";
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
		return ((nota + nota1 + nota2 + nota3)/4);
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
