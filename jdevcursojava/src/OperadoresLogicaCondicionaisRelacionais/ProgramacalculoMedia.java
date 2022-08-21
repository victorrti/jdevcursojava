package OperadoresLogicaCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class ProgramacalculoMedia {
   public static void main(String[] args) {
	   int saida = 0;
	   String numeroEntrada;
	   double somaNumeros = 0;
	   Double numero1; 
	   
	   int quantidadeNumeros = 0;
	   while(saida == 0) {
		   numeroEntrada = JOptionPane.showInputDialog("informe a quantidade de pessoas:");
		   numero1 = Double.parseDouble(numeroEntrada);
		   somaNumeros += numero1;
		   quantidadeNumeros++;
		   saida = JOptionPane.showConfirmDialog(null, "deseja digitar incluir mais numeros ?");
		   
		   
	   }
	   double media = somaNumeros/quantidadeNumeros;
	   JOptionPane.showMessageDialog(null, "quantidade de numeros :" + quantidadeNumeros);
	   JOptionPane.showMessageDialog(null, "soma total :" + somaNumeros);
	   JOptionPane.showMessageDialog(null, "A media e :" + media);
   }
}
