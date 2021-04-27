package br.com.erickfreire.desenhaalvoscoresaleatorias;

import javax.swing.JFrame;

public class DesenhaAlvosCoresAleatoriasTeste extends JFrame{
	public static void main(String[] args) {
		
		DesenhaAlvosCoresAleatorias painel = new DesenhaAlvosCoresAleatorias();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(250,200);
		aplicacao.setVisible(true);
		
	}

}
