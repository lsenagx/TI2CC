package com.ti2cc;

public class Personagem {
	private int id;
	private String nome;
	private String elemento;
	private int raridade;
	
	public Personagem() {
		this.id = 0;
		this.nome = "";
		this.elemento = "";
		this.raridade = 0;
	}
	
	public Personagem(int id, String nome, String elemento, int raridade) {
		this.id = id;
		this.nome = nome;
		this.elemento = elemento;
		this.raridade = raridade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getRaridade() {
		return raridade;
	}

	public void setRaridade(int raridade) {
		this.raridade = raridade;
	}

	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nome=" + nome + ", elemento=" + elemento + ", raridade=" + raridade + "]";
	}	
}
