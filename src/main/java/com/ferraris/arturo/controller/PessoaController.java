package com.ferraris.arturo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ferraris.arturo.model.Pessoa;
import com.ferraris.arturo.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping("/listar-pessoas")
	@ResponseStatus(HttpStatus.OK)
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/{id}/buscar-pessoa")
	@ResponseStatus(HttpStatus.OK)
	public Object listarPessoa(@PathVariable Long id) {
		return pessoaRepository.findById(id);
	}

	@PostMapping("/criar-pessoas")
	@ResponseStatus(HttpStatus.CREATED)
	public void adicionar(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}

	@PutMapping("/{id}/editar-pessoa")
	@ResponseStatus(HttpStatus.OK)
	public Pessoa editar(@RequestBody Pessoa pessoa, @PathVariable Long id) {
		pessoa.setId(id);
		return pessoaRepository.save(pessoa);
	}

}
