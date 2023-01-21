package dio.spring.jpa.projeto.jpa.projeto.controller;

import dio.spring.jpa.projeto.jpa.projeto.entity.Matricula;
import dio.spring.jpa.projeto.jpa.projeto.entity.form.MatriculaForm;
import dio.spring.jpa.projeto.jpa.projeto.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) { return service.create(form);}

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }
}
