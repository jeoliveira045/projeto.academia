package dio.spring.jpa.projeto.jpa.projeto.repository;

import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
