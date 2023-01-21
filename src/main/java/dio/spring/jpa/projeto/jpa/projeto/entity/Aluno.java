package dio.spring.jpa.projeto.jpa.projeto.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_aluno")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)// O mappedBy serve pra esclarecer a respeito de qual coluna em uma tabela B vai ser usada representar B aqui na tabela A
    // ja o parametro fetch aqui vai configurar que quando as informações a respeito de um aluno forem carregadas, todas as informações menos a lista de avaliações
    // fisicas vão ser carregadas
    @JsonIgnore// Por questão de possíveis exceptions sendo lançadas e que podem ser evitadas, essa exceção tá aqui
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    
}
