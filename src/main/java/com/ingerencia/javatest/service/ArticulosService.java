package com.ingerencia.javatest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class ArticulosService implements IArticulosService {

	@Override
	public String getArticulos(String api) {
		// TODO Auto-generated method stub
	
		InputStream respuestaApi = null;
		StringBuilder respuesta = null;
		
		try {
			
			URL url = new URL (api);
			HttpURLConnection conexion = (HttpURLConnection)url.openConnection();
			conexion.setRequestProperty("Content-Type", "application/json; utf-8");
	        conexion.setRequestProperty("Accept", "application/json");
	        conexion.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
	        conexion.connect();
	        
			if(conexion.getResponseCode()==HttpURLConnection.HTTP_OK) 
				respuestaApi = conexion.getInputStream();

			BufferedReader lectorRespuesta = new BufferedReader(new InputStreamReader(respuestaApi));
		    respuesta = new StringBuilder();
		    String currentLine;
		    
		    while ((currentLine = lectorRespuesta.readLine()) != null) 
			    respuesta.append(currentLine);
		    lectorRespuesta.close();
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return respuesta.toString();
	}

}
