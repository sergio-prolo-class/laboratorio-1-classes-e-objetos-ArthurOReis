package ifsc.poo.classes;

public class Livro {
    // Modele um livro que possui título, autor, até dois gêneros literários, o número total de páginas,
    // os títulos de cada capítulo e as páginas onde cada capítulo começa. Assuma que o livro pode
    // ter, no máximo, 30 capítulos. A lista de possíveis gêneros literários é: Fantasia, Aventura,
    // Romance, Mistério, Terror, Auto-ajuda e Pedagógico
    private String titulo, autor;
    private String[] generos_literarios = new String[2];
    private String[] titulos_capitulos = new String[30];
    private int[] capitulos_inicio = new int[30];
    private int total_paginas;
}
