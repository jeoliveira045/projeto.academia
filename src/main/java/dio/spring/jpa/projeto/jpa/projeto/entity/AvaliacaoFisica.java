package dio.spring.jpa.projeto.jpa.projeto.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)// Essa anotação faz a ponte entre a tabela entidade aluno com a tabela atual.
    //  Já o cascade vai passar a informação de que todas as alterações que ocorrerem aqui, deverão ser refletidas na coluna com a lista de avaliações fisicas em aluno
    @JoinColumn(name = "aluno_id")// Essa anotação determina qual coluna vai ser usada como armazenadora das chaves estrangeiras(nesse caso, de aluno)
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
    @Column(name = "peso_atual")
    private double peso;
    @Column(name = "altura_atual")
    private double altura;
}
