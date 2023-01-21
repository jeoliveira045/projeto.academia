 package dio.spring.jpa.projeto.jpa.projeto.entity.form;

 import lombok.AllArgsConstructor;
 import lombok.Data;
 import lombok.NoArgsConstructor;

 import java.time.LocalDate;

 import javax.validation.constraints.*;

 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 public class AlunoForm {
     @NotEmpty(message = "Preencha o campo corretamente") // Essa validação só é realizada a nivel local. Pra ela ser
     // realizada no endpoint, A anotação @Valid precisa estar ao lado da anotação do parâmetro ou outra anotação no parâmetro
     @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")// pesquisar
     // mais sobre EL Expression
     private String nome;

     @NotEmpty(message = "Preencha o campo corretamente")
     private String cpf;

     @NotEmpty(message = "Preencha o campo corretamente")
     @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
     private String bairro;

     @NotNull(message = "Preencha o campo corretamente")
     @Past(message="Data ${validatedValue} é inválida") // Essa anotação informa que a data de nascimento tem que estar
     // no passado, por motivos obvios
     private LocalDate dataDeNascimento;
 }
