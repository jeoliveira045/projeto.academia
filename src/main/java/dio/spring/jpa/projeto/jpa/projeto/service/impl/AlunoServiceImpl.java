package dio.spring.jpa.projeto.jpa.projeto.service.impl;

import dio.spring.jpa.projeto.jpa.projeto.entity.Aluno;
import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoForm;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoUpdateForm;
import dio.spring.jpa.projeto.jpa.projeto.repository.AlunoRepository;
import dio.spring.jpa.projeto.jpa.projeto.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.getById(id);
    }

    // String dataDeNascimento
    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento == null){
            return repository.findAll();
        } else{
            return repository.findByDataDeNascimento(LocalDate.parse(dataDeNascimento));
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
//        Aluno aluno = repository.getById(id);
//        aluno.setNome(formUpdate.getNome());
//        aluno.setBairro(formUpdate.getBairro());
//        aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());
//        repository.save(aluno);
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return repository.getById(id).getAvaliacoes();
    }
}
