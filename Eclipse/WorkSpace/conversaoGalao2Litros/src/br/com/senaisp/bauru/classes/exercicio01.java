package br.com.senaisp.bauru.classes;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Digite um número " + "inteiro de ate 3 dígitos");
        Scanner sc = new Scanner(System.in);
        int vlr = sc.nextInt(); //solicita a user o valor
        int c = vlr / 100;
        int d = vlr % 100 / 10;
        int u = vlr % 10;
        int vlrinv = u * 100 + d * 10 + c;
        System.out.println(vlrinv);
        sc.close();
	}

}
