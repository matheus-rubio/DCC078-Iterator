package com.dcc.ufjf;

import java.util.Iterator;

public class ContadorLivros {

    public static Integer contarLivrosDisponiveis(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivros(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator<Livro> iterator = biblioteca.iterator(); iterator.hasNext(); ) {
            quantidade++;
            iterator.next();
        }
        return quantidade;
    }
}
