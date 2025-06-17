package br.com.senaisp.bauru.classes05;

import java.util.Scanner;

public class exemplo_03_part_three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next(); //Utiliza o delimitador padrão
		System.out.println("Seu nome é " + nome);
		//Agora pegando o nome completo
		System.out.println("Digite seu nomecompleto: ");
		sc.nextLine();//Captura o enter do comando anterior
		String nomecompleto = sc.nextLine(); // usa o delimitador \n
		System.out.println("Nome completo: " + nomecompleto);
		sc.close();



	}

}
