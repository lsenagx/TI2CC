package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Personagem personagem = new Personagem(11, "Aloy", "Gelo", 5);
		if(dao.inserirPersonagem(personagem) == true) {
			System.out.println("Inserção com sucesso -> " + personagem.toString());
		}
		
		//Mostrar personagens raridade 5		
		System.out.println("==== Mostrar Personagens Raridade 5 === ");
		Personagem[] personagens = dao.getPersonagensRaridade5();
		for(int i = 0; i < personagens.length; i++) {
			System.out.println(personagens[i].toString());
		}

		//Atualizar personagens
		personagem.setElemento("novo elemento");
		dao.atualizarPersonagem(personagem);

		//Mostrar personagens
		System.out.println("==== Mostrar Personagens === ");
		personagens = dao.getPersonagens();
		for(int i = 0; i < personagens.length; i++) {
			System.out.println(personagens[i].toString());
		}
		
		//Excluir personagens
		dao.excluirPersonagem(personagem.getId());
		
		//Mostrar personagens
		personagens = dao.getPersonagens();
		System.out.println("==== Mostrar Personagens === ");		
		for(int i = 0; i < personagens.length; i++) {
			System.out.println(personagens[i].toString());
		}
		
		dao.close();
	}
}