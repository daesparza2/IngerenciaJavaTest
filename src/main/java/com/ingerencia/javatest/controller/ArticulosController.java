package com.ingerencia.javatest.controller;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingerencia.javatest.service.IArticulosService;

@RestController
@RequestMapping(value="/articulos")
public class ArticulosController {
	
	@Value("${ingerencia.javatest.url}")
	private String url;
	
	@Autowired
	private IArticulosService artService;
	
	@GetMapping("/getArticulos")
	public Map<String,Object> getArticulos() {
		
		JSONObject articulos = new JSONObject(artService.getArticulos(url));
		return articulos.toMap();
	}
}
