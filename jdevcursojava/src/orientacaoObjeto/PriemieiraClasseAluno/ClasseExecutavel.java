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
		
		/* // utilizando primeiro metodo calculo media
		
		aluno1.getDisciplina()
		aluno1.setNota1(20);
		aluno1.setNota2(30);
		aluno1.setNota3(40); */
		
    
		
	/*	System.out.println(aluno1.getMediaNota());
		
		// metodo retorna aprovado
		
		System.out.println("Resultado :"+  (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		System.out.println(aluno1.toString()); */
		 
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		 aluno3.setNome("Victor");
		 aluno4.setNome("Victor");
		 
		 if(aluno3.equals(aluno4)) {
			 System.out.println("os alunos são iguais");
		 }else {
			 System.out.println("não sãop iguais");		 }
		 
		 Aluno aluno5 = new Aluno();
		 
		 Disciplina disciplina2 = new Disciplina();
		 aluno5.setDisciplina(disciplina2);
		 
		/* aluno5.getDisciplina().setNota1(10);
		aluno5.getDisciplina().setNota2(10);
		aluno5.getDisciplina().setNota3(10);
		 aluno5.getDisciplina().setNota4(10); */
		 
		 /* System.out.println(aluno5.getMediaNota()); */
		 Disciplina disciplina1 = new Disciplina();
		 Disciplina disciplina3 = new Disciplina();
		 Disciplina disciplina4= new Disciplina();
		 Disciplina disciplina5 = new Disciplina();
		 
		 disciplina1.setDisciplina("matematica");
		 disciplina3.setDisciplina("portugues");
		 disciplina4.setDisciplina("fisica");
		 disciplina5.setDisciplina("quimica");
		 
		 disciplina1.setNota(100);
		 disciplina3.setNota(80);
		 disciplina4.setNota(80);
		 disciplina5.setNota(90);
		 
		 
		Aluno alunoListaDisciplina  = new Aluno();
			
			
		 alunoListaDisciplina.getDisciplia().add(disciplina1);
		 alunoListaDisciplina.getDisciplia().add(disciplina3);
		 alunoListaDisciplina.getDisciplia().add(disciplina4);
		 alunoListaDisciplina.getDisciplia().add(disciplina5);
		 
		 System.out.println(alunoListaDisciplina.getDisciplia());
		 System.out.println(alunoListaDisciplina.getMedia(alunoListaDisciplina.getDisciplia()));
		 
	}
	
	 
	
	
	 
	 
	 
	  
			 
	
	

}
