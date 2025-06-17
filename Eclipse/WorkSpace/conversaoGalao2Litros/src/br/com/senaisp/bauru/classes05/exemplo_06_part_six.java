package br.com.senaisp.bauru.classes05;

import java.util.Scanner;

public class exemplo_06_part_six {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 		System.out.println("Digite um valor entre 1 e 5:");
 		int vlr = sc.nextInt();
 		switch(vlr) {
		case 1: System.out.println("Voce ganhou uma caneta!");
		case 2: System.out.println("Voce ganhou um lapiz!");
		case 3: System.out.println("Voce ganhou uma borracha!");
		case 4: System.out.println("Voce ganhou um bombom!");
		case 5: System.out.println("Voce ganhou uma bala!");
		default: System.out.println("opção Invalida!");
 		}
 		sc.close();
 		
    }
}
