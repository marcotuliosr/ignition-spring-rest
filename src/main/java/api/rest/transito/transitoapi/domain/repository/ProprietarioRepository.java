package api.rest.transito.transitoapi.domain.repository;

import api.rest.transito.transitoapi.domain.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    List<Proprietario> findByNome(String nome);
}
