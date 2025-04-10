package ifsc.poo.classes;

public class Lampada {
    private boolean ligada = false;

    public void ligar(){
        System.out.println("Ligando lâmpada");
        this.ligada = true;
    }

    public void desligar(){
        System.out.println("Desligando lâmpada");
        this.ligada = false;
    }

    public boolean Estado(){
        return this.ligada;
    }
}
