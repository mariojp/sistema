package br.ucsal.sistema.filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistema.model.Usuario;

/**
 * Servlet Filter implementation class Seguranca
 */
@WebFilter("/*")
public class Seguranca implements Filter {

    /**
     * Default constructor. 
     */
    public Seguranca() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		if (httpServletRequest.getRequestURI().contains("index.jsp") || httpServletRequest.getRequestURI().contains("Autenticador")) {
			chain.doFilter(request, response);
		}else {
			Usuario usuario = (Usuario) httpServletRequest.getSession().getAttribute("usuario");
			if(usuario !=null) {
				chain.doFilter(request, response);
			} else {
				HttpServletResponse httpServletResponse = (HttpServletResponse) response;
				httpServletResponse.sendRedirect("index.jsp");
			}
		}
		
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
