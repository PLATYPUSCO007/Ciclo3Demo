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

public class ProveedoresJSON {
	private static URL url;
	private static String sitio = "http://localhost:5000/";

	public static ArrayList<Proveedores> parsingProveedores(String json) throws ParseException, org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Proveedores> lista = new ArrayList<Proveedores>();
		JSONArray proveedores = (JSONArray) jsonParser.parse(json);
		Iterator i = proveedores.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			
			Proveedores proveedor = new Proveedores();
			proveedor.setNit_proveedor(innerObj.get("nit_proveedor").toString());
			proveedor.setCiudad_proveedor(innerObj.get("ciudad_proveedor").toString());
			proveedor.setDireccion_proveedor(innerObj.get("direccion_proveedor").toString());
			proveedor.setNombre_proveedor(innerObj.get("nombre_proveedor").toString());
			proveedor.setTelefono_proveedor(innerObj.get("telefono_proveedor").toString());

			lista.add(proveedor);
		}
		return lista;
	}

	public static ArrayList<Proveedores> getJSON() throws IOException, ParseException, org.json.simple.parser.ParseException{
		url = new URL(sitio + "proveedores/listar");
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
		ArrayList<Proveedores> lista = new ArrayList<Proveedores>();
		lista = parsingProveedores(json);
		http.disconnect();
		
		return lista;
	}
	
	public static int postJSON(Proveedores proveedor, String accion) throws IOException {
		
		HttpURLConnection http = null;
		String authStr = "";
		
		if (accion.compareToIgnoreCase("Agregar") == 0) {
			url = new URL(sitio + "proveedores/guardar");
			http = (HttpURLConnection)url.openConnection();
			authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
			try {
			http.setRequestMethod("POST");
			} catch (ProtocolException e) {
			e.printStackTrace();
			}
		}
		
		if (accion.compareToIgnoreCase("Actualizar") == 0) {
			url = new URL(sitio + "proveedores/actualizar");
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
		+ "\"nit_proveedor\":\""+ proveedor.getNit_proveedor()
		+"\",\"ciudad_proveedor\":\""+proveedor.getCiudad_proveedor()
		+"\",\"direccion_proveedor\":\""+proveedor.getDireccion_proveedor()
		+"\",\"nombre_proveedor\": \""+proveedor.getNombre_proveedor()
		+"\",\"telefono_proveedor\": \""+proveedor.getTelefono_proveedor()
		+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}

	public static int deleteJSON(Proveedores proveedor) throws IOException {
		// TODO Auto-generated method stub
		HttpURLConnection http = null;
		String authStr = "";
		
		url = new URL(sitio + "proveedores/eliminar/" + proveedor.getNit_proveedor());
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
