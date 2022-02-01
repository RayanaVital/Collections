package br.com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		
		//a interface list armazena elementos ordenados pela inserçao que podem ser repetidos, armazena elemantos num array interno que pode diminuir ou aumentar

		ArrayList carrinho = new ArrayList (); // declaramos e intanciamos
		Double valor = 100.55;
		int valor2 = 1;
		int valor3;
		carrinho.add(valor); //adicionamos valor ao array list carrinho 
		carrinho.add ("uva");
        carrinho.add (valor2);
		
		System.out.println(carrinho.size());
		System.out.println(carrinho.get(1)); // da o valor do array posicionado em indice 1
		
//		valor3 = carrinho.get(2);//não compila, precisaria de um cast
		
		valor3 = (int) carrinho.get(2);
		
		System.out.println(valor2);
		
		
		//Interface List e o uso de generics 
		//Generics não permite o uso de primitivos
		
		/*List<String> carrinho = new ArrayList<String>(); //neste array list so podemos ter itens de string, utilizando generics 
		
		System.out.println(carrinho.isEmpty()); //true pois o array foi instanciado porem não havia intens 
		
		carrinho.add("Maça");
		carrinho.add("Morango");
		carrinho.add("Maça");
		carrinho.set(1, "Pera");//altera o conteudo de determinado indice no array
		
		System.out.println(carrinho.isEmpty()); // se o carrinho esta vazio 
		System.out.println(carrinho.size()); //determina o tamanho do array */
		
		
		
		

	}

}
