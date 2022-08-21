package OperadoresLogicaCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class CriadoOpcaoConfirmacao {
	 public static void main(String[] args) {
		 String carros = JOptionPane.showInputDialog("informe a quantidade de carros:");
		 String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas:");
		 double carroNumero = Double.parseDouble(carros);
		 int pessoaNumero = Integer.parseInt(pessoas);
		 double divisao =   carroNumero/pessoaNumero ;
		 
		int resposta =  JOptionPane.showConfirmDialog(null, "Deseja ver a divisão ?");
		
		 if(resposta == 0) {
			 JOptionPane.showMessageDialog(null, divisao);
		 }
		 
		 
	  }

}
