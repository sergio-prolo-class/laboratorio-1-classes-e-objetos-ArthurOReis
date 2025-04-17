/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.Random;
import java.util.Scanner;

import ifsc.poo.classes.Lampada;
import ifsc.poo.classes.Livro;
import ifsc.poo.classes.Pessoa;
import ifsc.poo.classes.Produto;
import ifsc.poo.classes.Relogio;
import ifsc.poo.classes.Retangulo;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Selecione qual teste você gostaria de fazer (Escolher de 1-6):");
            System.out.println("1 - Teste da Lâmpada");
            System.out.println("2 - Teste da Pessoa");
            System.out.println("3 - Teste do Retângulo");
            System.out.println("4 - Teste do Relógio");
            System.out.println("5 - Teste do Produto");
            System.out.println("6 - Teste do Livro");
            System.out.print("> ");
            int escolha = scanner.nextInt();
            System.out.println();
            
            switch(escolha){
                case 1 -> TesteLampada();
                
                case 2 -> TestePessoa();
                
                case 3 -> TesteRetangulo();
                
                case 4 -> TesteRelogio();
                
                case 5 -> TesteProduto();
                
                case 6 -> TesteLivro();
                
                default -> System.out.println("Argumento inválido");
            }
        }
    }

    public static void TesteLampada(){
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar();
        lampada2.desligar();

        System.out.println("Lampada 1 está ligada?: " + lampada1.Estado());
        System.out.println("Lampada 2 está ligada?: " + lampada2.Estado());
        
        System.out.println("Quantia lâmpadas: " + lampada1.getQntTotalLampadas());
    }

    public static void TestePessoa(){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.setNome("Alice");
        pessoa1.setIdade(22);

        pessoa2.setNome("Bruno");
        pessoa2.setIdade(25);

        pessoa2.felizAniversario();
        pessoa2.felizAniversario();
        pessoa2.felizAniversario();

        System.out.printf("A idade de %s é %d\n", pessoa1.getNome(), pessoa1.getIdade());
        System.out.printf("A idade de %s é %d\n", pessoa2.getNome(), pessoa2.getIdade());

        // pessoa1.setIdade(-44);
        // pessoa2.setNome("");

        /*
            Os dois últimos atributos estão comentados por não compilar o código, já que retorna erros já previstos na classe
        */
    }

    public static void TesteRetangulo(){
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(4);

        System.out.printf("A área do retângulo é 20: %b\nSeu perímetro é 18: %b\n", (retangulo.getArea() == 20), (retangulo.getPerimetro() == 18));
    
        Retangulo retangulos[] = new Retangulo[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            retangulos[i] = new Retangulo();
            retangulos[i].setLargura(rand.nextInt(10) + 1);
            retangulos[i].setAltura(rand.nextInt(10) + 1);
        }

        float maiorRazao = 0;
        Retangulo melhorRetangulo = null;
    
        for (Retangulo r : retangulos) {
            float razao = r.getArea() / r.getPerimetro();
            if (razao > maiorRazao) {
                maiorRazao = razao;
                melhorRetangulo = r;
            }
        }
    
        if (melhorRetangulo != null) {
            System.out.printf("O retângulo com a maior razão área/perímetro tem largura %.2f, altura %.2f, razão %.2f\n",
                melhorRetangulo.getLargura(), melhorRetangulo.getAltura(), maiorRazao);
        }
    
    }

    public static void TesteRelogio(){
        Relogio relogio = new Relogio();
        relogio.ajustaHora((byte)14, (byte)58, (byte)32);

        relogio.avancaMinuto();
        relogio.avancaMinuto();

        System.out.println("Hora atual: " + relogio.getHora());

        relogio.ajustaHora((byte)23, (byte)59, (byte)59);
        relogio.avancaSegundo();

        System.out.println("Hora atual: " + relogio.getHora());
    }

    public static void TesteProduto(){
        Produto produto_um = new Produto("Geladeira", 832);
        Produto produto_dois = new Produto("Micro-ondas", 499);

        System.out.printf("Produto: %s, preço: %.2f\n", produto_um.getNome(), produto_um.getPreco());
        System.out.printf("Produto: %s, preço: %.2f\n", produto_dois.getNome(), produto_dois.getPreco());
        System.out.println();

        produto_um.setDesconto(6);
        produto_dois.setDesconto(12);

        aplicarDesconto(produto_um);
        aplicarDesconto(produto_dois);
        // Como o atributo do preço dos produtos é inteiro, não tem como representar os centavos, ao descontar...

        System.out.printf("Produto: %s, novo preço: %.2f\n", produto_um.getNome(), produto_um.getPreco());
        System.out.printf("Produto: %s, novo preço: %.2f\n", produto_dois.getNome(), produto_dois.getPreco());

        System.out.println(produto_um.anuncio()); // O anúncio, apesar de funcionar, novamente lida com o problema de tipo de variável, não mostrando corretamente o preço do produto
        //TODO: Como observação final, para que a implementação da classe opere corretamente, será preciso trocar os atributos de preço e desconto para o tipo float, que permite números decimais
    }
    
    public static void TesteLivro() {
        String[] titulosCapitulos = {
            "Uma Festa Muito Esperada", "A Sombra do Passado", "Três é Demais", 
            "Um Atalho para Cogumelos", "Uma Conspiração Desmascarada", "A Floresta Velha", 
            "Em Casa de Tom Bombadil", "Névoa nas Colinas dos Túmulos", "No Pônei Empinado", 
            "Passolargo", "Um Faca na Noite", "Voo para o Vau", "Muitos Encontros", 
            "O Conselho de Elrond", "O Anel Vai para o Sul", "Uma Jornada no Escuro", 
            "A Ponte de Khazad-dûm", "Lothlórien", "O Espelho de Galadriel", 
            "Adeus a Lórien", "O Grande Rio", "A Partida da Sociedade"
        };

        int[] paginasInicio = {
            1, 23, 44, 66, 89, 110, 131, 154, 176, 197, 219, 240, 261, 
            282, 301, 320, 341, 361, 383, 403, 423, 446
        };

        Livro livro_um = new Livro(
            "O Senhor dos Anéis - A Sociedade do Anel", 
            "J. R. R. Tolkien", 
            new String[] {"Fantasia", "Aventura"}, 
            titulosCapitulos, 
            paginasInicio, 
            464
        );

        livro_um.lerPaginas(90);
        System.out.println("Quantia de páginas restantes: " + livro_um.getTotalPaginas());
        System.out.println("Capitulo atual: " + livro_um.getCapituloAtual());

        livro_um.lerPaginas(300);
        System.out.println("Capitulo atual: " + livro_um.getCapituloAtual());

        // livro_um.lerPaginas(300); // -> Como a quantidade de páginas restantes é menor, logo é retornado um erro

    }

    private static void aplicarDesconto(Produto produto) {
        float precoComDesconto = produto.getPreco() - (produto.getPreco() * produto.getDesconto() / 100);
        produto.setPreco((int) precoComDesconto);
    }
}
