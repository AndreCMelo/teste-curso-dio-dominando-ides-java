package com.dio.model;

import java.util.Objects;

public class Cat {
	private String nome;
	private String cor;
	private int idade;
	
	public Cat() {
	}

	public Cat(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(cor, other.cor) && idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cat [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

}
