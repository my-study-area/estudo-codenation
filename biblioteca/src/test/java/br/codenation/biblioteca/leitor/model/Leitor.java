package br.codenation.biblioteca.leitor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.codenation.biblioteca.avaliacao.model.Avaliacao;

@Entity
public class Leitor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @NotNull
    @NotBlank
    private String nome;
    
    @OneToMany
    private List<Avaliacao> avaliacoes;
}
