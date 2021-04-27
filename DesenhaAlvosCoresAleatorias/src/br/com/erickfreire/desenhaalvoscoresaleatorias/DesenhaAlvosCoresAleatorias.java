package br.com.erickfreire.desenhaalvoscoresaleatorias;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha alvos com cores aleatorias
 * @author Erick Freire
 * @version 1 - Criado em 27-04-2021 as 18:16
 */

public class DesenhaAlvosCoresAleatorias extends JPanel {
	
	public void paintComponent(Graphics g){
		
		super.paintComponent( g );
		int altura = getHeight();
		int largura = getWidth();
		int altura2 = altura - altura / 15;
		int largura2 = largura - largura / 15;
		int altura3 = altura / 30;
		int largura3 = largura / 30;
		
	    int r1;
	    int g1;
	    int b1;

	    int r2;
	    int g2;
	    int b2;
	    
	    SecureRandom numeroAleatorio = new SecureRandom();
	    
	    r1 = numeroAleatorio.nextInt(255);
	    g1 = numeroAleatorio.nextInt(255);
	    b1 = numeroAleatorio.nextInt(255);
	    r2 = numeroAleatorio.nextInt(255);
	    g2 = numeroAleatorio.nextInt(255);
	    b2 = numeroAleatorio.nextInt(255);
		
		
		for ( int i = 1 ; i <= 5 ; i++)
		{
			if ( i % 2 == 0 )
				g.setColor(Color.getHSBColor(r1, g1, b1));
			else
				g.setColor(Color.getHSBColor(r2, g2, b2));
			
			g.fillOval(largura3, altura3, largura2, altura2);
			
			altura2 -= altura / 5;
			largura2 -= largura / 5;
			
			altura3 += altura / 10;
			largura3 += largura / 10;
		}
	}
		
		
	
	
	

}
