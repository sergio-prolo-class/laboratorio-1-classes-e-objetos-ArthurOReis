package ifsc.poo.classes;

public class Retangulo {
    private float largura;
    private float altura;
    private static Retangulo maiorAreaRetangulo = null;

    public Retangulo(float largura, float altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Tamanhos devem ser positivos.");
        }
        this.largura = largura;
        this.altura = altura;

        if (maiorAreaRetangulo == null || this.getArea() > maiorAreaRetangulo.getArea()) {
            maiorAreaRetangulo = this;
        }
    }

    public Retangulo() {
        this.largura = 1;
        this.altura = 1;

        if (maiorAreaRetangulo == null || this.getArea() > maiorAreaRetangulo.getArea()) {
            maiorAreaRetangulo = this;
        }
    }

    public float getLargura() {
        return this.largura;
    }

    public boolean setLargura(float largura) {
        if (largura <= 0) {
            System.out.println("A largura deve ser positiva.");
            return false;
        }
        this.largura = largura;
        return true;
    }

    public float getAltura() {
        return this.altura;
    }

    public boolean setAltura(float altura) {
        if (altura <= 0) {
            System.out.println("A altura deve ser positiva.");
            return false;
        }
        this.altura = altura;
        return true;
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public static Retangulo getMaiorAreaRetangulo() {
        return maiorAreaRetangulo;
    }
}
