package dio.spring.jpa.projeto.jpa.projeto.service.impl;

import dio.spring.jpa.projeto.jpa.projeto.entity.Matricula;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.MatriculaForm;
import dio.spring.jpa.projeto.jpa.projeto.repository.AlunoRepository;
import dio.spring.jpa.projeto.jpa.projeto.repository.MatriculaRepository;
import dio.spring.jpa.projeto.jpa.projeto.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository repository;
    @Autowired
    private AlunoServiceImpl alunoService;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        matricula.setAluno(alunoService.get(form.getAlunoId()));
        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if (bairro == null) {
            return repository.findAll();
        }
        else{
            return repository.findAlunosMatriculadosBairro(bairro);
        }
    }
    @Override
    public void delete(Long id) {

    }
}
