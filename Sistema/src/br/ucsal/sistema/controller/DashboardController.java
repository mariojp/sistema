package br.ucsal.sistema.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.dao.UsuarioDAO;

/**
 * Servlet implementation class DashboardController
 */
@WebServlet("/Dashboard")
public class DashboardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO dao = new UsuarioDAO(request);
		request.setAttribute("lista", dao.obterTodos());
		request.getRequestDispatcher("dashboard.jsp").forward(request, response);

	}

	

}
