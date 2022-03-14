package com.dio;

import com.dio.model.Cat;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Cat gato = new Cat();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		}

}

class Livro {
	public String livro;
	public String nPg;
}
