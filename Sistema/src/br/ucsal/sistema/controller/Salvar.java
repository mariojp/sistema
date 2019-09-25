package br.ucsal.sistema.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.dao.PapelDAO;
import br.ucsal.sistema.dao.UsuarioDAO;
import br.ucsal.sistema.model.Papel;
import br.ucsal.sistema.model.Usuario;

/**
 * Servlet implementation class Salvar
 */
@WebServlet("/Salvar")
public class Salvar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String papelId = request.getParameter("papel");
		Usuario usuario = new Usuario();
		
		PapelDAO papelDAO = new PapelDAO(request);
		Papel papel = papelDAO.obter(Long.parseLong(papelId));
		
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setPapel(papel);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO(request);
		usuarioDAO.inserir(usuario);
		
		response.sendRedirect("Dashboard");
	}

}
