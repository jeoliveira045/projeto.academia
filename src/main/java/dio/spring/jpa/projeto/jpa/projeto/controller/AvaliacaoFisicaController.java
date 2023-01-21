package dio.spring.jpa.projeto.jpa.projeto.controller;

import dio.spring.jpa.projeto.jpa.projeto.entity.AvaliacaoFisica;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.AvaliacaoFisicaForm;
import dio.spring.jpa.projeto.jpa.projeto.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl Avservice;


    @PostMapping(value = "/adicionar-avaliacao")
    public AvaliacaoFisica criarAvaliacao(@RequestBody AvaliacaoFisicaForm form){
        return Avservice.create(form);
    }
    @DeleteMapping(value = "/deletar-avaliacao/{id}")
    public void deletarAvaliacao(@PathVariable("id") Long id){
        Avservice.delete(id);
    }
}
