package br.ucsal.sistema.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.dao.UsuarioDAO;
import br.ucsal.sistema.model.Usuario;

@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		
		UsuarioDAO dao = new UsuarioDAO(req);
		
		usuario = dao.obterUsuario(usuario);
		
		if(usuario == null ) {
			resp.sendRedirect("index.jsp?erro=Usuario não Encontrado");
		}else {
			req.getSession().setAttribute("usuario", usuario);
			resp.sendRedirect("Dashboard");
		}
		
		
	}
	
	
}
