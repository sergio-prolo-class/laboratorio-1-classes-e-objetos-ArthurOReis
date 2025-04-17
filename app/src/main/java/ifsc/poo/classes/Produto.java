package ifsc.poo.classes;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;

    public Produto(String nome, int preco, int desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    
    public Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
