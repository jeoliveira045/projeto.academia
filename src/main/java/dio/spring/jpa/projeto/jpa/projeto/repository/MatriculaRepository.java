package dio.spring.jpa.projeto.jpa.projeto.repository;

import dio.spring.jpa.projeto.jpa.projeto.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    @Query(value = "SELECT * FROM tb_matricula m " +
            "INNER JOIN tb_aluno a ON m.aluno_id = a.id" +
            "WHERE a.bairro = : bairro")// FORMA COMPLETA quando se precisa usar a forma completa da query que se precisa
    //Outra forma de realizar a mesma query é com o a anotação @Query
//    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")//FORMA RESUMIDA o resultado com dois pontos representa o valor que vai ser
    // repassado como parâmetro
    List<Matricula> findAlunosMatriculadosBairro(String bairro);

//    List<Matricula> findByAlunoBairro(String bairro);

}
