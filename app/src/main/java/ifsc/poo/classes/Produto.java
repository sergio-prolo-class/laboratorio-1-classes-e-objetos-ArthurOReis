package ifsc.poo.classes;

import java.util.LinkedList;

public final class Produto {
    private String nome;
    private int preco;
    private int desconto;
    private final String codigo;
    private static int total_produtos = 0;
    private static final int MAX_REGISTROS = 50;
    private static LinkedList<Produto> registroProdutos = new LinkedList<>();

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0;
        this.codigo = geraCodigo();
        adicionarAoRegistro(this);
    }

    private String geraCodigo() {
        total_produtos++;
        return String.format("CD:%03d-%03d", total_produtos / 1000, total_produtos % 1000);
    }

    private static void adicionarAoRegistro(Produto produto) {
        if (registroProdutos.size() >= MAX_REGISTROS) {
            registroProdutos.removeFirst();
        }
        registroProdutos.add(produto);
    }

    public static String getUltimoProduto() {
        if (registroProdutos.isEmpty()) {
            return "Nenhum produto foi criado ainda.";
        }
        Produto ultimoProduto = registroProdutos.getLast();
        return ultimoProduto.getNome() + ", (Código: " + ultimoProduto.getCodigo() + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return (float) preco;
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

    public String getCodigo() {
        return this.codigo;
    }

    public String anuncio() {
        return this.nome + ": de R$ " + (this.preco + (this.preco * this.desconto / 100)) + " por APENAS R$ " + this.getPreco() + "!";
    }

    public static String[] exportarRegistroCSV() {
        if (registroProdutos.isEmpty()) {
            return new String[] {"Nenhum produto registrado."};
        }
    
        String[] csv = new String[registroProdutos.size() + 1];
    
        csv[0] = "Código;Nome;Preço;Desconto";
    
        for (int i = 0; i < registroProdutos.size(); i++) {
            Produto produto = registroProdutos.get(i);
            csv[i + 1] = String.format(
                "%s;%s;%.2f;%d",
                produto.getCodigo(),
                produto.getNome(),
                produto.getPreco(),
                produto.getDesconto()
            );
        }
    
        return csv;
    }
}
