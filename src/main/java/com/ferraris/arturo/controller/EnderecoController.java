package com.ferraris.arturo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ferraris.arturo.model.Endereco;
import com.ferraris.arturo.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@PostMapping("/cadastrar-endereco")
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@GetMapping("/{id}/buscar-enderecos")
	@ResponseStatus(HttpStatus.OK)
	public List<Endereco> buscarEnderecoUsuarioByIdPessoas(@PathVariable Long id) {
		return enderecoRepository.findByIdPessoa(id);
	}

}
