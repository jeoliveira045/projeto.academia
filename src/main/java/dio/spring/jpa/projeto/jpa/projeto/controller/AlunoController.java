package dio.spring.jpa.projeto.jpa.projeto.controller;

import dio.spring.jpa.projeto.jpa.projeto.entity.Aluno;
import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AlunoForm;
import dio.spring.jpa.projeto.jpa.projeto.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

//    @GetMapping
//    public List<Aluno> getAll(){
//        return service.getAll();
//
//    }

    @PostMapping(value = "/adicionar-aluno")
    public Aluno create(@Valid @RequestBody AlunoForm form){
         return service.create(form);
    }

    @GetMapping(value = "/avaliacoes/{id}")
    public List<AvaliacaoFisica> avaliacoes(@PathVariable("id") Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value="dataDeNascimento", required = false) String dataDeNascimento){
        return service.getAll(dataDeNascimento); // A anotação @RequestParam serve para que o parametro seja repassado a
        // partir da seguinte estrutura: http://host:porta/endpoint?parametro=argumento
    }
}
