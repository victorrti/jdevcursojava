package jdevcursojava;

public class VariavelTipoString {
	public static void main(String[] args) {
		
		String textoQualquer = "A String armazena textos, cadeias de caracteres.";
		String texto2 = "sendo possivel concatenar";
		System.out.println(textoQualquer);
		System.out.println(textoQualquer + " " + texto2);
		
		System.out.println(texto2.concat(textoQualquer));
	}

}
