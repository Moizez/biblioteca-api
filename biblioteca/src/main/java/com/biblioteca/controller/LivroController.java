package com.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/")
public class LivroController {

	@Autowired
	private LivroRepository repository;
	
	@GetMapping("/livro")
	public List<Livro> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/livro/nome")
	public Optional<Livro> cozinhaPorNome(String nome) {
		return repository.findByNomeIgnoreCaseContaining(nome);
	}
}
