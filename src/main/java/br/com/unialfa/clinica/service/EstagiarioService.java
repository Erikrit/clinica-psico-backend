package br.com.unialfa.clinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.unialfa.clinica.entity.Estagiario;


public interface EstagiarioService {
	
	List<Estagiario> listarTodos();
	
	void salvar(Estagiario estagiarios);
	
	void  delete(Long id);
	
	Optional<Estagiario> findById(Long id);
	
}
