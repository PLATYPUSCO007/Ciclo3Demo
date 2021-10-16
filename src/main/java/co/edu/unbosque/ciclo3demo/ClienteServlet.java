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
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteServlet() {
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
		String actualizar = request.getParameter("Actualizar");
		String borrar = request.getParameter("Borrar");

		if (agregar != null) {
			agregarClientes(request, response, agregar);
		}

		if (listar != null) {
			listarClientes(request, response);
		}

		if (actualizar != null) {
			agregarClientes(request, response, actualizar);
		}

		if (borrar != null) {
			borrarClientes(request, response);
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

	public void agregarClientes(HttpServletRequest request, HttpServletResponse response, String accion) {
		int respuesta = 0;
		String pagina = "/clientes.jsp";
		Clientes cliente;

		String cedula_cliente = request.getParameter("cedula");
		String telefono_cliente = request.getParameter("telefono");
		String nombre_cliente = request.getParameter("nombre");
		String email_cliente = request.getParameter("email");
		String direccion_cliente = request.getParameter("direccion");

		cliente = new Clientes();
		cliente.setCedula_cliente(cedula_cliente);
		cliente.setTelefono_cliente(telefono_cliente);
		cliente.setNombre_cliente(nombre_cliente);
		cliente.setEmail_cliente(email_cliente);
		cliente.setDireccion_cliente(direccion_cliente);

		try {
			respuesta = ClientesJSON.postJSON(cliente, accion);
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

	public void listarClientes(HttpServletRequest request, HttpServletResponse response) {
		try {
			ArrayList<Clientes> listaClientes = ClientesJSON.getJSON();
			String pagina = "/listarClientes.jsp";
			request.setAttribute("Clientes", listaClientes);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void borrarClientes(HttpServletRequest request, HttpServletResponse response) {
		int respuesta = 0;
		Clientes cliente;
		try {
			cliente = new Clientes();
			cliente.setCedula_cliente(request.getParameter("cedula"));
			respuesta = ClientesJSON.deleteJSON(cliente);
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
