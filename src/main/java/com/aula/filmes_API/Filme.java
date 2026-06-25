package com.aula.filmes_API;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Long id;

    private String titulo;
    private String genero;
    private int ano;

    public Filme() {}

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public Long getId()       { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAno()       { return ano; }


    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setAno(int ano)          { this.ano = ano; }
}
