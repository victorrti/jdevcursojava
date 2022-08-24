package orientacaoObjeto.PriemieiraClasseAluno;

public class ClasseExecutavel {
	public static void main(String[] args) {
		 /* new aluno e uma instancia*/
		Aluno aluno1 = new Aluno();
		
		/* construtor com parametro*/
		Aluno aluno2 = new Aluno("Victor");
		
		System.out.println(aluno2.getNome());
		
		// setando valores e buscando 
		
		aluno1.setNomeMae("Edna");
		System.out.println(aluno1.getNomeMae());
		
		
	}

}
