package entorno;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Elegir extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		char c =req.getParameter("Ingresar").charAt(0);
		RequestDispatcher rd=null;
		
		switch (c) {
		
		case '1':
			System.out.println("etra");
			rd = req.getRequestDispatcher("/WEB-INF/IngresarPlato.jsp");
			rd.forward(req, resp);
			
			break;
			
		case '2':
			rd = req.getRequestDispatcher("/WEB-INF/IngresarCliente.jsp");
			rd.forward(req, resp);
			break;
			
			
		case '3':
			rd = req.getRequestDispatcher("/WEB-INF/IngresarCliente.jsp");
			rd.forward(req, resp);
			break;
		case '4':
			rd = req.getRequestDispatcher("/WEB-INF/Clientes.jsp");
			rd.forward(req, resp);
			break;
		case '5':
			rd = req.getRequestDispatcher("/WEB-INF/IngresarCliente.jsp");
			rd.forward(req, resp);
			break;
		default:
			break;
		}
		
	}

}
