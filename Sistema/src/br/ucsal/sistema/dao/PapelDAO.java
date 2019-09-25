package br.ucsal.sistema.dao;

import javax.servlet.http.HttpServletRequest;

import br.ucsal.sistema.model.Papel;
import br.ucsal.sistema.util.Repositorio;

public class PapelDAO {
	
	private Repositorio repositorio;


	public PapelDAO(HttpServletRequest request) {
		repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");
	}

	public Object obterTodos() {
		return repositorio.getPapeis();
	}

	public Papel obter(long id) {
		Papel papel = null;
		for (Papel p : repositorio.getPapeis()) {
			if(p.getId() == id) {
				papel = p;
			}
		}
		return papel;
	}

}
