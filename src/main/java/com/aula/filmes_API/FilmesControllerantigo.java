package com.aula.filmes_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FilmesControllerantigo {

    @GetMapping("/filmes2")
    public List<Filmes> listar() {
        return List.of(
            new Filmes("Interestelar",       "Ficção Científica", 2014),
            new Filmes("Parasita",           "Drama",             2019),
            new Filmes("O Poderoso Chefão",  "Crime",             1972),
            new Filmes("Matrix",             "Ficção Científica", 1999),
            new Filmes("Clube da Luta",      "Drama",             1999)
        );
    }
}
