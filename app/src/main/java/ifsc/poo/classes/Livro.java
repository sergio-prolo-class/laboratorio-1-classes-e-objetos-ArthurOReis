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

    public Livro(String titulo, String autor, String[] generos_literarios, String[] titulos_capitulos, int[] capitulos_inicio, int total_paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.generos_literarios = generos_literarios;
        this.titulos_capitulos = titulos_capitulos;
        this.capitulos_inicio = capitulos_inicio;
        this.total_paginas = total_paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return total_paginas;
    }

    public void setTotalPaginas(int total_paginas) {
        this.total_paginas = total_paginas;
    }

    public String[] getGenerosLiterarios(){
        return this.generos_literarios;
    }

    public void setGenerosLiterarios(String[] generos_literarios){
        this.generos_literarios = generos_literarios;
    }

    public String[] getTitulosCapitulos(){
        return this.titulos_capitulos;
    }

    public void setTitulosCapitulos(String[] titulos_capitulos){
        this.titulos_capitulos = titulos_capitulos;
    }

    public int[] getCapitulosInicio(){
        return this.capitulos_inicio;
    }

    public void setCapitulosInicio(int[] capitulos_inicio){
        this.capitulos_inicio = capitulos_inicio;
    }
}
