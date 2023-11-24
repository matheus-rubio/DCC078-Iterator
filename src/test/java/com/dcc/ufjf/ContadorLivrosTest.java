package com.dcc.ufjf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorLivrosTest {

    @Test
    void deveContarLivrosDisponiveisNaBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Java: The Complete Reference", true),
                new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", true),
                new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", false),
                new Livro("The Pragmatic Programmer: Your Journey to Mastery", true)
        );
        assertEquals(3, ContadorLivros.contarLivrosDisponiveis(biblioteca));
    }

    @Test
    void deveContarTotalLivrosNaBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Java: The Complete Reference", true),
                new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", true),
                new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", false),
                new Livro("The Pragmatic Programmer: Your Journey to Mastery", true)
        );
        assertEquals(4, ContadorLivros.contarTotalLivros(biblioteca));
    }
}

