package br.ucsal.sistema.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.dao.UsuarioDAO;
import br.ucsal.sistema.model.Usuario;

/**
 * Servlet implementation class ExcluirController
 */
@WebServlet("/Excluir")
public class ExcluirController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Usuario usuario = new Usuario();
		usuario.setId(Long.parseLong(id));
		UsuarioDAO dao = new UsuarioDAO(request);
		dao.excluir(usuario);
		response.sendRedirect("Dashboard");
		
		
		
	}

	

}
