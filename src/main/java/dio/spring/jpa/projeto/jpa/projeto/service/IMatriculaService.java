 package dio.spring.jpa.projeto.jpa.projeto.service;

 import java.util.List;

 import dio.spring.jpa.projeto.jpa.projeto.entity.Matricula;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.MatriculaForm;

 public interface IMatriculaService {
     Matricula create(MatriculaForm form);

     Matricula get(Long id);

     List<Matricula> getAll(String bairro);

     void delete(Long id);
 }
