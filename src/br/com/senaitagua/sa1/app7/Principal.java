package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.EstoqueBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira peça:"));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda peça:"));
		double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira peça:"));
		double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta peça:"));
		double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quinta peça:"));
		
		EstoqueBO ebo = new EstoqueBO();
		
		JOptionPane.showMessageDialog(null,"Valor Total: R$ "+ ebo.somarPecas(p1, p2, p3, p4, p5));
		
	}

}
