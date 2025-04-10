/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.Scanner;

import ifsc.poo.classes.Lampada;
import ifsc.poo.classes.Pessoa;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione qual teste você gostaria de fazer (Escolher de 1-4):");
        System.out.println("1 - Teste da Lâmpada");
        System.out.println("2 - Teste da Pessoa");
        System.out.println("3 - Teste do Retângulo");
        System.out.println("4 - Teste do Relógio");
        System.out.print("> ");
        int escolha = scanner.nextInt();

        switch(escolha){
            case 1 -> TesteLampada();
            
            case 2 -> TestePessoa();

            case 3 -> TesteRetangulo();

            case 4 -> TesteRelogio();
            
            default -> System.out.println("Argumento inválido");
        }

        scanner.close();
    }

    public static void TesteLampada(){
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar();
        lampada2.desligar();

        System.out.println("Lampada 1 está ligada?: " + lampada1.Estado());
        System.out.println("Lampada 2 está ligada?: " + lampada2.Estado());
        
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
        
    }

    public static void TesteRelogio(){
        
    }
}
