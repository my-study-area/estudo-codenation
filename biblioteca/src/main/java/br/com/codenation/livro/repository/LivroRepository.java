package br.com.codenation.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.livro.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{}
