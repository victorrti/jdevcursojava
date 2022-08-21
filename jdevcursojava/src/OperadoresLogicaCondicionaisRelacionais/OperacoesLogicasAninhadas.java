package OperadoresLogicaCondicionaisRelacionais;

public class OperacoesLogicasAninhadas {
	public static void main(String[] args) {
		double mediaAluno = calculomedia();

		if (mediaAluno >= 50) {
			if(mediaAluno >= 70) {
				System.out.println("Aluno Aprovado direto");
			} else {
				System.out.println("Aluno em recuperação");
			}		
		} else {
			System.out.println("reprovado");
		}
			
	}
	
	public static  double calculomedia() {
		double nota1 = 70;
		double nota2 = 50;
		double nota3 = 40;
		double nota4 = 90;
		double media = (nota1 + nota2+ nota3 + nota4)/4;
		return media;
	}

}
