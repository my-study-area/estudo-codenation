package br.com.codenation.avaliacao.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import br.com.codenation.leitor.model.Leitor;
import br.com.codenation.livro.model.Livro;

@Embeddable
public class AvaliacaoIdentity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @NotNull
    private Leitor leitor;
    
    @ManyToOne
    @NotNull
    private Livro livro;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvaliacaoIdentity)) return false;

        AvaliacaoIdentity that = (AvaliacaoIdentity) o;

        if (leitor != null ? !leitor.equals(that.leitor) : that.leitor != null) return false;
        return livro != null ? livro.equals(that.livro) : that.livro == null;
    }

    @Override
    public int hashCode() {
        int result = leitor != null ? leitor.hashCode() : 0;
        result = 31 * result + (livro != null ? livro.hashCode() : 0);
        return result;
    }
}
