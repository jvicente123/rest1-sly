package entorno;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class GetPlato  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();

		//		resp.setContentType("text/html");
		//		String busq = "" ;
		//		String criterio = req.getParameter( "criterio" );
		//		String tipo = req.getParameter( "tipo" );
		//		String tipocarne = req.getParameter( "tipocarne" );
		//		double precio =  Double.parseDouble(req.getParameter("precio"));
		//		


		//		if( pm.currentTransaction().isActive() ){
		//			// Error occurred so rollback the transaction
		//			pm.currentTransaction().rollback();
		//		}
		//
		//Se consultan todas las Personas
		//		final
		Query q = pm.newQuery(Plato.class);
		//		if (!criterio.equals( "todo" )){
		//			q.setFilter( "criterio == criterioParam" );
		//			q.declareParameters( "String criterioParam" );
		//			busq = criterio;
		//			}
		//		if (!tipo.equals( "todo" )){
		//			q.setFilter( "tipo == tipoParam" );
		//			q.declareParameters( "String tipoParam" );
		//			busq = tipo;
		//			}
		//		if (!tipocarne.equals( "tipocarne" )){
		//			q.setFilter( "tipocarne == tipocarneParam" );
		//			q.declareParameters( "String tipocarneParam" );
		//			busq = tipocarne;
		//			}
		//		q.setOrdering("id descending");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		try{
			//			@SuppressWarnings("unchecked")
			List<Plato> platos = (List<Plato>) q.execute();
			/*
			 * Comunicación Servlet-JSP
			 * Primero se crea el atributo 'personas'
			 * Luego llama al JSP ubicado en la carpeta WEB-INF
			 * Finalmente envia los objetos 'req y resp. 'req' tiene el atributo nuevo
			 * */

			req.setAttribute("platos", platos);
			req.setAttribute("formPlato", false);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/listaplatos.jsp");
			rd.forward(req, resp);
			/*
			 * 
			 * */
		}catch(Exception e){
			System.out.println(e);
		}
		pm.close();

	}
}