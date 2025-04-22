package ifsc.poo.classes;

public class Lampada {
    private boolean ligada;
    private static int qnt_total_lampadas = 0;

    public Lampada(boolean estado){
        this.ligada = estado;
        qnt_total_lampadas++;
    }

    public Lampada(){
        this.ligada = false;
        qnt_total_lampadas++;
    }

    public boolean ligar(){
        System.out.println("Ligando lâmpada");
        this.ligada = true;
        return true;
    }

    public boolean desligar(){
        System.out.println("Desligando lâmpada");
        this.ligada = false;
        return true;
    }

    public boolean Estado(){
        return this.ligada;
    }

    public int getQntTotalLampadas(){
        return qnt_total_lampadas;
    }
}
