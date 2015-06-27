package entorno;
import java.util.*;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
	

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")

	public class IniciarSesion extends HttpServlet {

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			HttpSession sesion = request.getSession();
			String usu, pass;
			usu = request.getParameter("user");
			pass = request.getParameter("pass");

			if(usu.equals("admin") && pass.equals("admin")&& sesion.getAttribute("usuario") == null ){

				sesion.setAttribute("usuario", usu);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Funcion.jsp");
				rd.forward(request, response);
				
			}
			try{
			
				PersistenceManager pm = PMF.get().getPersistenceManager();
				Query q = pm.newQuery(Cliente.class);
				 List <Cliente> registro = (List<Cliente>)q.execute(); 
				 for(Cliente p: registro){
					 System.out.println("xd");
					 if(p.getEmail().equals(usu)&&p.getPass().equals(pass)){
						 sesion.setAttribute("usuario", usu);
						 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/reserva.jsp");
						 rd.forward(request, response);
					 }}
							
						
			}catch(Exception e){
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
				
			}
		
		}
				
		

		//m�todo encargado de la gesti�n del m�todo GET
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String out=request.getParameter("salir");
			HttpSession sesion = request.getSession();
			if(out.equals("salir")){
				sesion.invalidate();
				response.sendRedirect("/index.jsp");
			}
			else{
				response.sendRedirect("/index.jsp");
			}
		}
	}
//			PersistenceManager pm = PMF.get().getPersistenceManager();
//			
//			if(sesion.getAttribute("usuario")!=null){
//				final Query q = pm.newQuery(Cliente.class);
//				String usuario = request.getParameter("usuario" );
//				if (!usuario.equals( "todo" )){
//					q.setFilter( "usuario == usuarioiParam" );
//					q.declareParameters( "String usuario" );
//					busq = usuario;
//					}
//				q.setOrdering("id descending");
//				try{
//					@SuppressWarnings("unchecked")
//					List<Cliente> numnClien = (List<Cliente>) q.execute(busq);
//					
//					
//					for (Cliente c :numnClien) {
//							if (c.equals("usuario")){
//								
//												}				
//							}
//				
//				
//			}catch(Exception e){
//				System.out.println(e);
//			}finally{
//				//Comprobar
//				if( pm.currentTransaction().isActive() ){
//					
//					pm.currentTransaction().rollback();
//				}
//				//
//				q.closeAll();
//			}
			

