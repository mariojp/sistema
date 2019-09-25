package br.ucsal.sistema.dao;

import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import br.ucsal.sistema.model.Usuario;
import br.ucsal.sistema.util.Repositorio;

public class UsuarioDAO {
	
	
	
	
	private Repositorio repositorio;
	
	
	public UsuarioDAO(HttpServletRequest request) {	
		repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");
		System.out.println(repositorio);
	}
	
	
	public Usuario obterUsuario(Usuario usuario) {
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		System.out.println(Arrays.toString(repositorio.getUsuarios().toArray()));
		Usuario resultado =null;
		for (Usuario u : repositorio.getUsuarios()) {
			if(u.getLogin().equals(usuario.getLogin()) 
					&& u.getSenha().equals(usuario.getSenha())) {
				resultado = u;
			}
		}
		System.out.println(resultado.getLogin());
		return resultado;
	}


	public List<Usuario> obterTodos() {
		return repositorio.getUsuarios();
	}


	public void excluir(Usuario usuario) {
		Usuario resultado = null;
		for (Usuario u : repositorio.getUsuarios()) {
			if(u.getId() == u.getId()) {
				resultado = u;
			}
		}
		if(resultado != null)
			repositorio.getUsuarios().remove(resultado);
	}


	public void inserir(Usuario usuario) {
		Usuario ultimo = repositorio.getUsuarios().get(repositorio.getUsuarios().size()-1);
		Long novoId = ultimo.getId()+1;
		usuario.setId(novoId);
		repositorio.getUsuarios().add(usuario);
	}
	

}
