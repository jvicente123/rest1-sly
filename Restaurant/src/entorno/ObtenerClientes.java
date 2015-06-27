package entorno;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class ObtenerClientes extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		HttpSession ses = req.getSession(true);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		Query q = pm.newQuery(Cliente.class);
		
		try{
			List<Cliente> personas = (List<Cliente>) q.execute();
			for(Cliente p: personas){
				
			}		
//			ses.setAttribute("nombre", personas);
//			RequestDispatcher rd =getServletContext().getRequestDispatcher("Clientes.jsp");
//			rd.forward(req, resp);
			List<Cliente> registro = (List<Cliente>) q.execute();
			out.println("<ul>");
			for(Cliente p: registro){
				out.print("<li>");
				out.println(p.getNombre());
				out.print("</li><br>");
			}
	
		}catch(Exception e){
			
		}finally{
			 q.closeAll();
		}
		
	}
	}