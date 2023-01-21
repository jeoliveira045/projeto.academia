package dio.spring.jpa.projeto.jpa.projeto.service.impl;

import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoUpdateForm;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AvaliacaoFisicaForm;
import dio.spring.jpa.projeto.jpa.projeto.repository.AvaliacaoFisicaRepository;
import dio.spring.jpa.projeto.jpa.projeto.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    @Autowired
    public AlunoServiceImpl alunoService;

    @Autowired
    public AvaliacaoFisicaRepository repository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        avaliacao.setAluno(alunoService.get(form.getAlunoId()));
        avaliacao.setAltura(form.getAltura());
        avaliacao.setPeso(form.getPeso());
        return repository.save((avaliacao));
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
