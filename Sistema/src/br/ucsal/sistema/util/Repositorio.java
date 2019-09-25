package br.ucsal.sistema.util;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.sistema.model.Papel;
import br.ucsal.sistema.model.Usuario;

public class Repositorio {
	
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Papel> papeis = new ArrayList<>();
	
	public Repositorio() {
		Papel papel = new Papel();
		papel.setId(1l);
		papel.setDescricao("ADMIN");
		papeis.add(papel);

		Usuario usuario = new Usuario();
		usuario.setId(1l);
		usuario.setLogin("admin");
		usuario.setSenha("123");
		usuario.setPapel(papel);
		usuarios.add(usuario);
	}
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Papel> getPapeis() {
		return papeis;
	}
	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

}
