package br.ucsal.sistema.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.dao.PapelDAO;
import br.ucsal.sistema.dao.UsuarioDAO;

/**
 * Servlet implementation class NovoController
 */
@WebServlet("/Novo")
public class NovoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PapelDAO dao = new PapelDAO(request);
		request.setAttribute("listaPapeis", dao.obterTodos());
		request.getRequestDispatcher("usuario.jsp").forward(request, response);
	}


}
