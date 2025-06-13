package br.com.senaisp.bauru.aula03;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte by = 127;//-128 a 127 
        by++;
        System.out.println(by);
        char letra = 'A'; //65
        letra += 3;
        System.out.println(letra);
        if ('A'>'a') {
        	System.out.println("A é maior que a");
        }else {
        	System.out.println("a é Maiorque A");
        }
        char letra2 = 'X';
        System.out.println(letra + letra2);
        System.out.println("" + letra + letra2);
        int vl = 10;
        int v12 = ++vl + 5;
        System.out.println(vl + " " + v12);
        vl = 10;
        v12 = ++vl+ 5;
        System.out.println(vl + " " + v12);
	}
}
