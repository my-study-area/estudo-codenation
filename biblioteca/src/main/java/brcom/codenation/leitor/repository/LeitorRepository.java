package brcom.codenation.leitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.leitor.model.Leitor;

public interface LeitorRepository extends JpaRepository<Leitor, Long>{}
