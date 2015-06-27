package entorno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class SavePlato1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		String nombre = req.getParameter("nombre");
		String tipo = req.getParameter("tipo");
		String criterio = req.getParameter("criterio");
		String tipocarne = req.getParameter("tipocarne");
		String precio = req.getParameter("precio");
		String descripcion = req.getParameter("descripcion");
		String imagen = req.getParameter("img");

		Plato p = new Plato(nombre, tipo,criterio,tipocarne,precio,descripcion, imagen);

		PersistenceManager pm = PMF.get().getPersistenceManager();

		try{
			pm.makePersistent(p);
			System.out.println("bien");
		}catch(Exception e){
			System.out.println("mal");
		}
	}
}