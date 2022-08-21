package OperadoresLogicaCondicionaisRelacionais;

public class IfElse {
	public static void main(String[] args) {
		double mediaAluno = calculomedia();

		if (mediaAluno >= 70) {
			System.out.println("Aprovado");
		} else if (mediaAluno < 60) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Recuperação");
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
