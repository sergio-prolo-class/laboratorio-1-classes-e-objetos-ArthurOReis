package ifsc.poo.classes;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        if(nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void felizAniversario(){
        this.idade = this.idade + 1;
        System.out.printf("Parabéns %s! Você está fazendo %d anos!", this.nome, this.idade);
    }
}
