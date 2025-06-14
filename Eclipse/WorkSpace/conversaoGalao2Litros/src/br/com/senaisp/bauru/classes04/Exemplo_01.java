package br.com.senaisp.bauru.classes04;

public class Exemplo_01 {

	public static void main(String[] args) {
        int vlr01 = 10;
        int vlr02 = vlr01;
        System.out.println("Vlr01: " + vlr01);
        System.out.println("Vlr02: " + vlr02);
        //Strings str01 = "Abelha";
        String str01 = "Abelha";
        String str02 = str01;
        System.out.println("Str01: " + str01);        
        System.out.println("Str02: " + str02);
        //Nessa comparação, é feita de endereço de memoria
        //nao conteudo
        System.out.println(str01==str02); 
        //Para comparar conteudo usamos equals ou compare
        System.out.println(str01.equals(str02));        
	}

}
