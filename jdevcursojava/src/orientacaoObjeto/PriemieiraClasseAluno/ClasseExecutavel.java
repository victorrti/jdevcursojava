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
		
		// utilizando primeiro metodo calculo media
		
		aluno1.setNota(10);
		aluno1.setNota1(20);
		aluno1.setNota2(30);
		aluno1.setNota3(40);
		
		System.out.println(aluno1.getMediaNota());
		
		// metodo retorna aprovado
		
		System.out.println("Resultado :"+  (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		System.out.println(aluno1.toString());
		
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		 aluno3.setNome("Victor");
		 aluno4.setNome("Victor");
		 
		 if(aluno3.equals(aluno4)) {
			 System.out.println("os alunos são iguais");
		 }else {
			 System.out.println("não sãop iguais");		 }
	}
	
	

}
