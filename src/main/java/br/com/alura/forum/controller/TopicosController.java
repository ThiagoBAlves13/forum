package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {
		
	@RequestMapping("/topicos")
	public List<Topico> lista() {
			
	}
	
}
