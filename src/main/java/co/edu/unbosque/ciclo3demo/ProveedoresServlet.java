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
 * Servlet implementation class ProveedoresServlet
 */
@WebServlet("/ProveedoresServlet")
public class ProveedoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProveedoresServlet() {
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
			agregarProveedor(request, response, agregar);
		}

		if (listar != null) {
			listarProveedor(request, response);
		}

		if (actualizar != null) {
			agregarProveedor(request, response, actualizar);
		}

		if (borrar != null) {
			borrarProveedor(request, response);
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

	public void agregarProveedor(HttpServletRequest request, HttpServletResponse response, String accion) {
		int respuesta = 0;
		String pagina = "/proveedores.jsp";
		Proveedores proveedor;

		String nit = request.getParameter("nit");
		String ciudad_proveedor = request.getParameter("ciudad");
		String direccion_proveedor = request.getParameter("direccion");
		String nombre_proveedor = request.getParameter("nombre");
		String telefono_proveedor = request.getParameter("telefono");

		proveedor = new Proveedores();
		proveedor.setNit_proveedor(request.getParameter("nit"));
		proveedor.setCiudad_proveedor(ciudad_proveedor);
		proveedor.setDireccion_proveedor(direccion_proveedor);
		proveedor.setNombre_proveedor(nombre_proveedor);
		proveedor.setTelefono_proveedor(telefono_proveedor);
		

		try{
			respuesta = ProveedoresJSON.postJSON(proveedor, accion);
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

	public void listarProveedor(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Proveedores> lista = ProveedoresJSON.getJSON();
			String pagina = "/"; // modificar
			request.setAttribute("lista", lista);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void borrarProveedor(HttpServletRequest request, HttpServletResponse response) {
		int respuesta = 0;
		Proveedores proveedor;
		try {
			proveedor = new Proveedores();
			proveedor.setNit_proveedor(request.getParameter("nit"));
			respuesta = ProveedoresJSON.deleteJSON(proveedor);// MODIFICAR
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
