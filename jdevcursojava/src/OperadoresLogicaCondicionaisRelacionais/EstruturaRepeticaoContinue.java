package OperadoresLogicaCondicionaisRelacionais;

public class EstruturaRepeticaoContinue {
	public static void main(String[] args) {
		for(int numero = 0; numero <10; numero ++) {
			if(numero == 6 || numero == 8) {
				System.out.println("numero " + numero);
				continue;
			}
			System.out.println("processando laço");
		}
		
	}

}
