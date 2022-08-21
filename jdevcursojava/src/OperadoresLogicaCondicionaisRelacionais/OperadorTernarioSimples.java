package OperadoresLogicaCondicionaisRelacionais;

public class OperadorTernarioSimples {
	public static void main(String[] args) {
		double mediaAluno = calculomedia();

		String resultadoAluno = mediaAluno >= 70 ? "APROVADO" : "REPROVADO";
		System.out.println(resultadoAluno);
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
