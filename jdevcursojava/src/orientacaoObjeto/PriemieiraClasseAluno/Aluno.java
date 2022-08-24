package orientacaoObjeto.PriemieiraClasseAluno;

public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
    private double nota;
	
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

	private String nomePai;
	private String dataMatricula;
	private String serieMatriculaddo;
	
	
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

}
