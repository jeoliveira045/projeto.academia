 package dio.spring.jpa.projeto.jpa.projeto.service;

 import java.util.List;

 import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoForm;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoUpdateForm;
 import dio.spring.jpa.projeto.jpa.projeto.entity.form.AvaliacaoFisicaForm;

 public interface IAvaliacaoFisicaService {

     AvaliacaoFisica create(AvaliacaoFisicaForm form);

     AvaliacaoFisica get(Long id);

     List<AvaliacaoFisica> getAll();

     AvaliacaoFisica update(Long id, AlunoUpdateForm formUpdate);

     void delete(Long id);
 }
