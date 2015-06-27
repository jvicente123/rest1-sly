package entorno;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveAdministrador extends HttpServlet {
		public void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws IOException {
			String nombre = req.getParameter("nombre");
			String apellido = req.getParameter("apellido");
			String usuario= req.getParameter("usuario");
			String contraseña = req.getParameter("contrase�a");
		

			Administrador a = new Administrador(nombre, apellido,usuario, contraseña );

		final PersistenceManager pm = PMF.get().getPersistenceManager();

		try{
			pm.makePersistent(a);
			System.out.println("si");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
