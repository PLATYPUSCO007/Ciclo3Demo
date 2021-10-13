package co.edu.unbosque.ciclo3demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;

import org.apache.coyote.ProtocolException;
import org.apache.el.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClientesJSON {

	private static URL url;
	private static String sitio = "http://localhost:5000/";
	
	public static ArrayList<Clientes> parsingClientes(String json) throws ParseException, org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Clientes> lista = new ArrayList<Clientes>();
		JSONArray clientes = (JSONArray) jsonParser.parse(json);
		Iterator i = clientes.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			Clientes cliente = new Clientes();
			cliente.setCedula_cliente(innerObj.get("cedula_cliente").toString());
			cliente.setEmail_cliente(innerObj.get("email_cliente").toString());
			cliente.setDireccion_cliente(innerObj.get("direccion_cliente").toString());
			cliente.setNombre_cliente(innerObj.get("nombre_cliente").toString());
			cliente.setTelefono_cliente(innerObj.get("telefono_cliente").toString());;
			lista.add(cliente);
		}
		return lista;
	}
	
	public static ArrayList<Clientes> getJSON() throws IOException, ParseException, org.json.simple.parser.ParseException{
		url = new URL(sitio + "clientes/listar");
		String authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i<inp.length ; i++) {
		json += (char)inp[i];
		}
		ArrayList<Clientes> lista = new ArrayList<Clientes>();
		lista = parsingClientes(json);
		http.disconnect();
		
		return lista;
	}
	
	public static int postJSON(Clientes cliente, String accion) throws IOException {
		HttpURLConnection http = null;
		String authStr = "";
		
		if (accion.compareToIgnoreCase("Agregar") == 0) {
			url = new URL(sitio + "clientes/guardar");
			http = (HttpURLConnection)url.openConnection();
			authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
			try {
			http.setRequestMethod("POST");
			} catch (ProtocolException e) {
			e.printStackTrace();
			}
		}
		
		if (accion.compareToIgnoreCase("Actualizar") == 0) {
			url = new URL(sitio + "clientes/actualizar");
			http = (HttpURLConnection)url.openConnection();
			authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
			try {
			http.setRequestMethod("PUT");
			} catch (ProtocolException e) {
			e.printStackTrace();
			}
		}
		
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{"
		+ "\"cedula_cliente\":\""+ cliente.getCedula_cliente()
		+"\",\"direccion_cliente\": \""+ cliente.getDireccion_cliente()
		+"\",\"email_cliente\": \""+ cliente.getEmail_cliente()
		+"\",\"nombre_cliente\":\""+ cliente.getNombre_cliente()
		+"\",\"telefono_cliente\":\""+ cliente.getTelefono_cliente()
		+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}
	
	public static int deleteJSON(Clientes cliente) throws IOException {
		HttpURLConnection http = null;
		String authStr = "";
		
		url = new URL(sitio + "clientes/eliminar/" + cliente.getCedula_cliente());
		http = (HttpURLConnection)url.openConnection();
		authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
		try {
			http.setRequestMethod("DELETE");
		} catch (ProtocolException e) {
		e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Basic " + authStr);
		http.setRequestProperty("Content-Type", "application/json");
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}

}
