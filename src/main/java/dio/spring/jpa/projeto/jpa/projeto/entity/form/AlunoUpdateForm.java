 package dio.spring.jpa.projeto.jpa.projeto.entity.form;

 import lombok.Data;

 import java.time.LocalDate;

@Data
 public class AlunoUpdateForm {

   private String nome;

   private String bairro;

   private LocalDate dataDeNascimento;
 }
