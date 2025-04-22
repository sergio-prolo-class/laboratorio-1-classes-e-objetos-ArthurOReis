package ifsc.poo.classes;

public class Barco {
    private final String nome;
    private final int tamanho;
    private boolean foiInserido;
    private final char simbolo;
    private int linha;
    private int coluna; 
    private boolean orientacaoVertical;
    private final boolean[] posicoesAtingidas;

    public Barco(String nome, int tamanho, char simbolo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.simbolo = simbolo;
        this.foiInserido = false;
        this.posicoesAtingidas = new boolean[tamanho];
    }

    public void setPosicao(int linha, int coluna, boolean orientacaoVertical) {
        this.linha = linha;
        this.coluna = coluna;
        this.orientacaoVertical = orientacaoVertical;
        this.foiInserido = true;
    }

    public boolean verificarAtingido(int linhaAtaque, int colunaAtaque) {
        if (!foiInserido) {
            return false;
        }

        for (int i = 0; i < tamanho; i++) {
            int linhaAtual = orientacaoVertical ? linha + i : linha;
            int colunaAtual = orientacaoVertical ? coluna : coluna + i;

            if (linhaAtual == linhaAtaque && colunaAtual == colunaAtaque) {
                posicoesAtingidas[i] = true; 
                return true;
            }
        }
        return false;
    }

    public boolean verificarAfundado() {
        for (boolean atingido : posicoesAtingidas) {
            if (!atingido) {
                return false;
            }
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean getFoiInserido() {
        return foiInserido;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isOrientacaoVertical() {
        return orientacaoVertical;
    }
}
