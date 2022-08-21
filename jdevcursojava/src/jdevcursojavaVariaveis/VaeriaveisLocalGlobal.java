package jdevcursojavaVariaveis;

public class VaeriaveisLocalGlobal {
	/* Variavel Global e acessivel a todos */
	static int MaiorIdadeGlobal = 30;
	public static void main(String[] args) {
		/* Variavel local pois pertence somente a este metodo*/
		
		int maiorIdade = 18;
		System.out.println("variavel local :"+ maiorIdade);
		
		metodo2();		
		
	}
	
	public static void metodo2() { 
		System.out.println("variavel global :"+ MaiorIdadeGlobal);
	}
}
