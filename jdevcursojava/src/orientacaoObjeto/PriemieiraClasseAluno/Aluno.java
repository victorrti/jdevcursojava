package orientacaoObjeto.PriemieiraClasseAluno;

public class Aluno {
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String serieMatriculaddo;
	
	
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
