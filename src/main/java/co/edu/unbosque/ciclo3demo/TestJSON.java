package co.edu.unbosque.ciclo3demo;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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

public class TestJSON {
	
	private static URL url;
	private static String sitio = "http://localhost:5000/";

	public static ArrayList<Usuarios> parsingUsuarios(String json) throws ParseException, org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		JSONArray usuarios = (JSONArray) jsonParser.parse(json);
		Iterator i = usuarios.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			Usuarios usuario = new Usuarios();
			usuario.setCedula_usuario(innerObj.get("cedula_usuario").toString());
			usuario.setEmail_usuario(innerObj.get("email_usuario").toString());
			usuario.setNombre_usuario(innerObj.get("nombre_usuario").toString());
			usuario.setPassword(innerObj.get("password").toString());
			usuario.setUsuario(innerObj.get("usuario").toString());
			lista.add(usuario);
		}
		return lista;
	}

	public static ArrayList<Usuarios> getJSON() throws IOException, ParseException, org.json.simple.parser.ParseException{
		url = new URL(sitio + "usuarios/listar");
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
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		lista = parsingUsuarios(json);
		http.disconnect();
		
		return lista;
	}
	
	public static int postJSON(Usuarios usuario, String accion) throws IOException {
		
		HttpURLConnection http = null;
		String authStr = "";
		
		if (accion.compareToIgnoreCase("Agregar") == 0) {
			url = new URL(sitio + "usuarios/guardar");
			http = (HttpURLConnection)url.openConnection();
			authStr = Base64.getEncoder().encodeToString("usuario:tiendagenerica".getBytes());
			try {
			http.setRequestMethod("POST");
			} catch (ProtocolException e) {
			e.printStackTrace();
			}
		}
		
		if (accion.compareToIgnoreCase("Actualizar") == 0) {
			url = new URL(sitio + "usuarios/actualizar");
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
		+ "\"cedula_usuario\":\""+ usuario.getCedula_usuario()
		+"\",\"email_usuario\": \""+usuario.getEmail_usuario()
		+"\",\"nombre_usuario\": \""+usuario.getNombre_usuario()
		+"\",\"password\":\""+usuario.getPassword()
		+"\",\"usuario\":\""+usuario.getUsuario()
		+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}

	public static int deleteJSON(Usuarios usuario) throws IOException {
		// TODO Auto-generated method stub
		HttpURLConnection http = null;
		String authStr = "";
		
		url = new URL(sitio + "usuarios/eliminar/" + usuario.getCedula_usuario());
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
