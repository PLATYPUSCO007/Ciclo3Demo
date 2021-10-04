package co.edu.unbosque.ciclo3demo;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  String listar = request.getParameter("Listar"); 
		  String agregar = request.getParameter("Agregar");
		  String ingresar = request.getParameter("Ingresar");
		  
		  if(agregar != null) { agregarUsuario(request, response); }
		  
		  if(listar != null) { listarUsuarios(request, response); }
		  
		  if(ingresar != null) { validarCredenciales(request, response); }
		 
	}
	
	public void validarCredenciales(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String usuarioValidate = request.getParameter("usuario");
		String passValidate = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		
		if (usuarioValidate.equalsIgnoreCase("admininicial") && passValidate.equalsIgnoreCase("admin123456") ) {
			writer.println("Usuario Correcto!");
		}else {
			writer.println("Usuario Erroneo!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void agregarUsuario(HttpServletRequest request, HttpServletResponse response) {
		Usuarios usuario = new Usuarios();
		usuario.setNombre_usuario(request.getParameter("nombre"));
		usuario.setCedula_usuario(request.getParameter("cedula"));
		usuario.setEmail_usuario(request.getParameter("email"));
		usuario.setUsuario(request.getParameter("usuario"));
		usuario.setPassword(request.getParameter("password"));
		int respuesta = 0;
		try {
			respuesta = TestJSON.postJSON(usuario);
			PrintWriter writer = response.getWriter();
			if (respuesta == 200) {
				writer.println("Registro Agregado!");
			}else {
				writer.println("Error " + respuesta);
			}
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void listarUsuarios(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Usuarios> lista = TestJSON.getJSON();
			String pagina = "/resultado.jsp";
			request.setAttribute("lista", lista);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
