package com.aula.filmes_API;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class FilmesController {

    private final FilmeRepository repository;

    public FilmesController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/filmes")
    public List<Filme> listar() {
        return repository.findAll();
    }

    @PostMapping("/filmes")
    public Filme adicionar(@RequestBody Filme filme) {
        return repository.save(filme);
    }

    @DeleteMapping("/filmes/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "Filme removido.";
    }
}
