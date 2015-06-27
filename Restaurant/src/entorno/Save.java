package entorno;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Save extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String nombre = req.getParameter("nombre");
		String paterno=req.getParameter("paterno");
		String materno = req.getParameter("materno");
		int dni = Integer.parseInt(req.getParameter("dni"));
		String email=req.getParameter("email");
		String pass =req.getParameter("pass");
		
		
		
		Cliente registro= new Cliente(nombre ,paterno ,materno , dni ,email ,pass );
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try{
			pm.makePersistent(registro);
			resp.sendRedirect("index.jsp");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("     ");
		}finally{
			pm.close();
		}
	}
}
