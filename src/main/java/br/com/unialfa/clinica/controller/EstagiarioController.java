package br.com.unialfa.clinica.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unialfa.clinica.entity.Estagiario;
import br.com.unialfa.clinica.service.EstagiarioService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EstagiarioController {

	@Autowired
	EstagiarioService estagiarioService;
	
	@RequestMapping(value="/estagiario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Estagiario> salvar(@RequestBody Estagiario estagiario) {
		System.out.println("oi" + estagiario.toString());
		estagiarioService.salvar(estagiario);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Mono.just(estagiario);
	}
	@RequestMapping(value="/estagiario", method = RequestMethod.GET)
	public Mono<List<Estagiario>> listarTodos() {
		return Mono.just(estagiarioService.listarTodos());
	}
	
	
	
}
