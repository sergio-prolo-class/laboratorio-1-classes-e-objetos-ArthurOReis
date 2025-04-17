package ifsc.poo.classes;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(){
        this.segundo = 00;
        this.minuto = 00;
        this.hora = 00;
    }

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        this.segundo = hora;
        this.minuto = minuto;
        this.hora = segundo;
    }

    public byte getHora(){ 
        return this.hora;
    }

    public void avancaHora(){
        if(this.hora == 23){
            this.hora = 0;
            return;
        }
        this.hora += 1;
    }

    public void avancaMinuto(){
        if(this.minuto == 59){
            avancaHora();
            this.minuto = 0;
            return;
        }
        this.minuto += 1;
    }
    
    public void avancaSegundo(){
        if(this.segundo == 59){
            avancaMinuto();
            this.segundo = 0;
            return;
        }
        this.segundo += 1;
    }

}
