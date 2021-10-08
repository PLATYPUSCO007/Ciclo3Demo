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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String listar = request.getParameter("Listar");
		String agregar = request.getParameter("Agregar");
		String ingresar = request.getParameter("Ingresar");
		String actualizar = request.getParameter("Actualizar");
		String borrar = request.getParameter("Borrar");

		if (agregar != null) {
			agregarUsuario(request, response, agregar);
		}

		if (listar != null) {
			listarUsuarios(request, response);
		}

		if (ingresar != null) {
			validarCredenciales(request, response);
		}

		if (actualizar != null) {
			agregarUsuario(request, response, actualizar);
		}

		if (borrar != null) {
			borrarUsuarios(request, response);
		}

	}

	public void validarCredenciales(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String usuarioValidate = request.getParameter("usuario");
		String passValidate = request.getParameter("password");
		PrintWriter writer = response.getWriter();

		if (usuarioValidate.equalsIgnoreCase("admininicial") && passValidate.equalsIgnoreCase("admin123456")) {
			writer.println("Usuario Correcto!");
		} else {
			writer.println("Usuario Erroneo!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void agregarUsuario(HttpServletRequest request, HttpServletResponse response, String accion) {
		int respuesta = 0;
		String pagina = "/usuarios.jsp";
		Usuarios usuario;
		
		if (accion.compareToIgnoreCase("Actualizar") == 0) {
			String nombre = request.getParameter("nombre");
			String cedula = request.getParameter("cedula");
			String email = request.getParameter("email");
			String user = request.getParameter("usuario");
			String password = request.getParameter("password");
			
			usuario = new Usuarios();
			if ((nombre != null) && (nombre.length() > 0)) {
				System.out.println(nombre);
				usuario.setNombre_usuario(nombre);
			}
			
			if (cedula.length() > 0) {
				System.out.println(cedula);
				usuario.setCedula_usuario(cedula);
			}
			
			if ((email != null) && (email.length() > 0)) {
				System.out.println(email);
				usuario.setEmail_usuario(email);
			}
			
			if ((user != null) && (user.length() > 0)) {
				usuario.setUsuario(user);
			}
			
			if ((password != null) && (password.length() > 0)) {
				usuario.setPassword(password);
			}
			
			
		} else {
			usuario = new Usuarios();
			usuario.setNombre_usuario(request.getParameter("nombre"));
			usuario.setCedula_usuario(request.getParameter("cedula"));
			usuario.setEmail_usuario(request.getParameter("email"));
			usuario.setUsuario(request.getParameter("usuario"));
			usuario.setPassword(request.getParameter("password"));
		}
		

		try {
			respuesta = TestJSON.postJSON(usuario, accion);
			PrintWriter writer = response.getWriter();
			if (respuesta == 200) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
				dispatcher.forward(request, response);
			} else {
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

	/*
	 * public void actualizarUsuarios(HttpServletRequest request,
	 * HttpServletResponse response) { Usuarios usuario = new Usuarios();
	 * usuario.setNombre_usuario(request.getParameter("nombre"));
	 * usuario.setCedula_usuario(request.getParameter("cedula"));
	 * usuario.setEmail_usuario(request.getParameter("email"));
	 * usuario.setUsuario(request.getParameter("usuario"));
	 * usuario.setPassword(request.getParameter("password")); int respuesta = 0; try
	 * { respuesta = TestJSON.postJSON(usuario); 
	 * PrintWriter writer = response.getWriter();
	 *  if (respuesta == 200) {
	 * writer.println("Registro Agregado!"); }else { writer.println("Error " +
	 * respuesta); } writer.close(); } catch (Exception e) { // TODO: handle
	 * exception e.printStackTrace(); } }
	 */

	public void borrarUsuarios(HttpServletRequest request, HttpServletResponse response) {
		int respuesta = 0;
		Usuarios usuario;
		try {
			usuario = new Usuarios();
			usuario.setCedula_usuario(request.getParameter("cedula"));
			respuesta = TestJSON.deleteJSON(usuario);
			PrintWriter writer = response.getWriter();
			if (respuesta == 200) {
				writer.println("Registro Eliminado!");
			} else {
				writer.println("Error " + respuesta);
			}
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
