package br.com.codenation.categoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.categoria.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}

