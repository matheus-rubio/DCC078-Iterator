package com.dcc.ufjf;

public class Livro {

    private String titulo;
    private boolean disponivel;

    public Livro(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
