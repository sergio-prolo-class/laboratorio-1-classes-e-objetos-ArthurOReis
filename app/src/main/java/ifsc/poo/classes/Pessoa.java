package ifsc.poo.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String cpf, String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        if(cpf.isEmpty()){
            this.cpf = "123.456.789-00";
        } else {
            this.cpf = cpf;
        }
    }


    public Pessoa(String cpf, String nome){
        this.nome = nome;
        if(cpf.isEmpty()){
            this.cpf = "123.456.789-00";
        } else {
            this.cpf = cpf;
        }
    }
    
    public Pessoa(String cpf){
        if(cpf.isEmpty()){
            this.cpf = "123.456.789-00";
        } else {
            this.cpf = cpf;
        }
    }

    public boolean setNome(String nome){
        if(nome.isEmpty()){
            System.out.println("O nome não pode ser vazio.");
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setIdade(int idade){
        if(idade < 0){
            System.out.println("A idade não pode ser negativa.");
            return false;
        }
        this.idade = idade;
        return true;
    }

    public int getIdade(){
        return this.idade;
    }

    public boolean felizAniversario(){
        this.idade = this.idade + 1;
        System.out.printf("Parabéns %s! Você está fazendo %d anos!\n", this.nome, this.idade);
        return true;
    }

    public String getCPF() {
        return this.cpf;
    }


    public boolean setCPF(String cpf){
        String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        if(!cpf.matches(regex)){
            System.out.println("CPF inválido. O formato deve ser xxx.xxx.xxx-xx.");
            return false;    
        }
        this.cpf = cpf;
        return true;
    }
}
