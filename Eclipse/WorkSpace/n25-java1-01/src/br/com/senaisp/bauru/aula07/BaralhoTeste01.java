package br.com.senaisp.bauru.aula07;

public class BaralhoTeste01 {

	public static void main(String[] args) {
         Baralho bar = new Baralho();
         Carta ct;
         do {
             ct= bar.getCartaSorteada();
             System.out.println(ct);
         }while(bar.getNumCartasDisp()>0);
	}
}
