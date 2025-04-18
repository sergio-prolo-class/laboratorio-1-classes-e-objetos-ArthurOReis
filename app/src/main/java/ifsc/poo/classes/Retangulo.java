package ifsc.poo.classes;

public class Retangulo {
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura){
        if(largura < 0 || altura < 0){
            throw new IllegalArgumentException("Tamanhos não podem ser negativos");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(){
        this.largura = 1;
        this.altura = 1;
    }

    public float getLargura(){
        return this.largura;
    }

    public void setLargura(float largura){
        this.largura = largura;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getArea(){
        return this.largura * this.altura;
    }

    public float getPerimetro(){
        return 2*(this.largura + this.altura);
    }
}
