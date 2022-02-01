package br.com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		
		//a interface list armazena elementos ordenados pela inser�ao que podem ser repetidos, armazena elemantos num array interno que pode diminuir ou aumentar

//		ArrayList carrinho = new ArrayList (); // declaramos e intanciamos
//		Double valor = 100.55;
//		int valor2 = 1;
//		int valor3;
//		carrinho.add(valor); //adicionamos valor ao array list carrinho 
//		carrinho.add ("uva");
//        carrinho.add (valor2);
		
//		System.out.println(carrinho.size());
//		System.out.println(carrinho.get(1)); // da o valor do array posicionado em indice 1
		
//		valor3 = carrinho.get(2);//n�o compila, precisaria de um cast
		
//		valor3 = (int) carrinho.get(2); //cast 
		
//		System.out.println(valor2);/*
		
		
		//Interface List e o uso de generics 
		//Generics n�o permite o uso de primitivos
		
//		List<String> carrinho = new ArrayList<String>(); //neste array list so podemos ter itens de string, utilizando generics 
		
//		System.out.println(carrinho.isEmpty()); //true pois o array foi instanciado porem n�o havia intens 
		
//		carrinho.add("Ma�a");
//		carrinho.add("Morango");
//		carrinho.add("Ma�a");
//		carrinho.set(1, "Pera");//altera o conteudo de determinado indice no array
		
//		System.out.println(carrinho.isEmpty()); // se o carrinho esta vazio 
//		System.out.println(carrinho.size()); //determina o tamanho do array
		
//		System.out.println(carrinho.contains("Ma�a")); //retorna se a palavra ma�a esta em alguns dos itens do nosso array
//		System.out.println(carrinho.indexOf("Ma�a")); //retorna a posi��o que a palavra esta
//		System.out.println(carrinho.get(carrinho.indexOf("Ma�a"))); //busca a palavra atraves a partir do posi��o retornada no index of
//		System.out.println(carrinho.lastIndexOf("Ma�a")); //ultima ocorrencia dentro do array list 
//		
//		carrinho.remove(carrinho.indexOf("Ma�a"));
//		System.out.println(carrinho.get(0));
//		
//		carrinho.clear();
//		System.out.println(carrinho.isEmpty());
		
//		Set<String> cesta = new HashSet<String>(); //variavel do tipo set chamado cesta 
//		
//		System.out.println(cesta.isEmpty()); //se esta vazio 
//		cesta.add("Ma�a");
//		cesta.add("ma�a");
//		cesta.add("Ma�a");
//		System.out.println(cesta.isEmpty()); //cesta recebeu adi��o de 3 itens 		
//		System.out.println(cesta.size()); //size � 2 porque a classe hash set n�o permite elementos duplicados 
//		System.out.println(cesta);
		
		//Interface map muito util quando precisamos recuperar um valor atraves de sua chave
		
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("M225", "Fernando");
		caixa.put("M226", "Maria");
		caixa.put("M227", "Soraya");
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M225"));
		System.out.println(caixa.containsValue("Fernando"));
		System.out.println(caixa);
		
		
		
		
		
		
		
		
		
		

	}

}
