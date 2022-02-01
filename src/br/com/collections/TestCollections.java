package br.com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		
		//a interface list armazena elementos ordenados pela inser�ao que podem ser repetidos, armazena elemantos num array interno que pode diminuir ou aumentar

		ArrayList carrinho = new ArrayList (); // declaramos e intanciamos
		Double valor = 100.55;
		int valor2 = 1;
		int valor3;
		carrinho.add(valor); //adicionamos valor ao array list carrinho 
		carrinho.add ("uva");
        carrinho.add (valor2);
		
		System.out.println(carrinho.size());
		System.out.println(carrinho.get(1)); // da o valor do array posicionado em indice 1
		
//		valor3 = carrinho.get(2);//n�o compila, precisaria de um cast
		
		valor3 = (int) carrinho.get(2);
		
		System.out.println(valor2);
		
		
		//Interface List e o uso de generics 
		//Generics n�o permite o uso de primitivos
		
		/*List<String> carrinho = new ArrayList<String>(); //neste array list so podemos ter itens de string, utilizando generics 
		
		System.out.println(carrinho.isEmpty()); //true pois o array foi instanciado porem n�o havia intens 
		
		carrinho.add("Ma�a");
		carrinho.add("Morango");
		carrinho.add("Ma�a");
		carrinho.set(1, "Pera");//altera o conteudo de determinado indice no array
		
		System.out.println(carrinho.isEmpty()); // se o carrinho esta vazio 
		System.out.println(carrinho.size()); //determina o tamanho do array */
		
		
		
		

	}

}
