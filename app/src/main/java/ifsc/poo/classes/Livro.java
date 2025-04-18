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
    private int total_paginas, paginas_lidas;

    public Livro(String titulo, String autor, String[] generos_literarios, String[] titulos_capitulos, int[] capitulos_inicio, int total_paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.generos_literarios = generos_literarios;
        this.titulos_capitulos = titulos_capitulos;
        this.capitulos_inicio = capitulos_inicio;
        this.total_paginas = total_paginas;
        this.paginas_lidas = 0;
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

    private boolean isGeneroValido(String genero) {
        String[] generosValidos = {"Fantasia", "Aventura", "Romance", "Mistério", "Terror", "Auto-ajuda", "Pedagógico"};
        for (String valido : generosValidos) {
            if (valido.equalsIgnoreCase(genero)) {
                return true;
            }
        }
        return false;
    }

    public void setGenerosLiterarios(String[] generos_literarios){
        if (generos_literarios.length > 2) {
            throw new IllegalArgumentException("Os livros pode ter no máximo dois gêneros literários.");
        }
        for (String genero : generos_literarios) {
            if (!isGeneroValido(genero)) {
                throw new IllegalArgumentException("Gênero literário inválido: " + genero);
            }
        }

        this.generos_literarios = generos_literarios;
    }

    public String getCapituloAtual() {
        for (int i = 0; i < this.capitulos_inicio.length; i++) {
            if (this.paginas_lidas < this.capitulos_inicio[i]) {
                return this.titulos_capitulos[i - 1]; // Retorna o capítulo anterior, pois o índice atual é o próximo capítulo
            }
        }
        return this.titulos_capitulos[this.capitulos_inicio.length - 1]; // Retorna o último capítulo se todas as páginas foram lidas
    }

    public void setTitulosCapitulos(String[] titulos_capitulos){
        if (titulos_capitulos.length > 30) {
            throw new IllegalArgumentException("Um livro pode ter no máximo 30 capítulos.");
        }
        
        this.titulos_capitulos = titulos_capitulos;
    }

    public int[] getCapitulosInicio(){
        return this.capitulos_inicio;
    }

    public void setCapitulosInicio(int[] capitulos_inicio){
        if (capitulos_inicio.length > 30) {
            throw new IllegalArgumentException("Os livros só podem ter no máximo 30 capítulos.");
        }
        for (int pagina : capitulos_inicio) {
            if (pagina < 0 || pagina > this.total_paginas) {
                throw new IllegalArgumentException("Página de início inválida: " + pagina);
            }
        }
        this.capitulos_inicio = capitulos_inicio;
    
    }

    public void lerPaginas(int paginas){
        if(paginas > this.total_paginas || paginas < 0){
            throw new IllegalArgumentException("Quantia lida de páginas inválidas");
        } else {
            this.total_paginas -= paginas;
            this.paginas_lidas += paginas;
        }
    }
}
