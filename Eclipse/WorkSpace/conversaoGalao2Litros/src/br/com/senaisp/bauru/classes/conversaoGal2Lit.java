package br.com.senaisp.bauru.classes;

import java.util.Scanner;

public class conversaoGal2Lit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("favor digitar a " + "quantidade de galões: ");
	
       double galao =sc.nextDouble();
       double litros = galao * 3.785;
       
       //fazendo a convrsão e mostrando
       System.out.println(galao + " galões é igaul a " + litros + " litros");
       sc.close();
	}

}
