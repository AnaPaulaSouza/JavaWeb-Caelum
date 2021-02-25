package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contato;
import dao.ContatoDao;

public class TesteRemove {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{ 
			
			// pronto para gravar
			Contato contato = new Contato();
			contato.setNome("Caelum Java web");
			contato.setEmail("contato@caelum.com.br");
			contato.setEndereco("R. Vergueiro 3185 cj57");
			contato.setDataNascimento(Calendar.getInstance());
			contato.setId(1L);
			
			// grave nessa conexão!!!
			ContatoDao dao = new ContatoDao();
			
			// método elegante
			dao.remove(contato);
			
			System.out.println("Deletado!");

		}

}
