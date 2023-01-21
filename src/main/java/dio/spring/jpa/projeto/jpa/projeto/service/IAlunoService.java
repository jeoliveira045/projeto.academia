 package dio.spring.jpa.projeto.jpa.projeto.service;

 import java.util.List;

 import dio.spring.jpa.projeto.jpa.projeto.entity.Aluno;
 import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoForm;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoUpdateForm;

 public interface IAlunoService {
     Aluno create(AlunoForm form);

     Aluno get(Long id);
//String dataDeNascimento

     // String dataDeNascimento
     List<Aluno> getAll(String dataDeNascimento);

     Aluno update(Long id, AlunoUpdateForm formUpdate);

     void delete(Long id);

     List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
 }
