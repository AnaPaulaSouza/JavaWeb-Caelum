package br.com.caelum.jdbc;

import java.util.List;

import br.com.caelum.jdbc.modelo.Contato;
import dao.ContatoDao;


public class TestaLista {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " +
					contato.getDataNascimento().getTime() + "\n");
		}

	}

}
