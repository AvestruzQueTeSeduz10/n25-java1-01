package goku.com;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
    //Criando uma variavel estatica
	private static int qtdeInstancias = 0;
	private static final long serialVersionUID = 1L;
	private int posX;
	private int posY;
	private Color cor;
	//Constructor
	public Desenho(int posX, int posY, Color cor) {
		qtdeInstancias++;
		this.posX = posX;
		this.posY = posY;
		this.cor = cor;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	//Metodo abstrato de desenharForma
	protected abstract void desenharForma(Graphics g);
	//Metodo mostrar desenho
	@Override
	public void paint(Graphics g) {
		desenharForma(g);
	}
	//metodo estatico
	public static int getQtdeInstancias() {
	     return qtdeInstancias;
    }
}	
