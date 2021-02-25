package br.com.caelum.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contato;
import dao.ContatoDao;

//TELA
public class TesteInsere {
	
	public static void main(String [] args) throws SQLException, ClassNotFoundException{ 
	
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();
		
		// método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
