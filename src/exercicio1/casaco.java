/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author feres
 */
public class casaco {
    
        String cor;
	String tipo;
	String tamanho;
	boolean desenho;
	
	void desenhar(){
		
		if(desenho)
			System.out.println("Desenho encontrado!");
		else
			System.out.println("Não há desenho!");
		
	}
	
	void vestir(){
		
	}
	
	void lavar(){
		
	}
	
	void status(){
            
		System.out.println("Classe casaco");
		System.out.println("Cor:" + cor);
		System.out.println("Tipo:" + tipo);
		System.out.println("Tamanho:" + tamanho);
	}

    
}
