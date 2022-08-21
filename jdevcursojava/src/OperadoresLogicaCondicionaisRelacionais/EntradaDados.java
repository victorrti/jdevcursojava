package OperadoresLogicaCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class EntradaDados {
  public static void main(String[] args) {
	 String carros = JOptionPane.showInputDialog("informe a quantidade de carros:");
	 String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas:");
	 double carroNumero = Double.parseDouble(carros);
	 int pessoaNumero = Integer.parseInt(pessoas);
	 System.out.println(carroNumero % pessoaNumero);
  }
}
