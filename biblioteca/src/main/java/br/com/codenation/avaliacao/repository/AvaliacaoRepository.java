package br.com.codenation.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.avaliacao.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>{}
