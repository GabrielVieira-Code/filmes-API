package com.aula.filmes_API;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    // nada aqui — o Spring já entrega tudo pronto
}
