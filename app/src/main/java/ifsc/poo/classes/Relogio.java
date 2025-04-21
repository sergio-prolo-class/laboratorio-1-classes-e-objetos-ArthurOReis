package ifsc.poo.classes;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(byte hora, byte minuto, byte segundo){
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    public Relogio(byte hora, byte minuto){
        this.segundo = 00;
        this.minuto = minuto;
        this.hora = hora;
    }

    public Relogio(byte hora){
        this.segundo = 00;
        this.minuto = 00;
        this.hora = hora;
    }

    public Relogio(){
        this.segundo = 00;
        this.minuto = 00;
        this.hora = 00;
    }

    

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Hora, minuto ou segundo inválidos.");
        }
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    public byte getHora(){ 
        return this.hora;
    }

    public void avancaHora(){
        this.hora = (byte)((this.hora + 1) % 24);
    }

    public void avancaMinuto(){
        if (this.minuto == 59) {
            avancaHora();
            this.minuto = 0;
        } else {
            this.minuto += 1;
        }
    }
    
    public void avancaSegundo(){
        if (this.segundo == 59) {
            avancaMinuto();
            this.segundo = 0;
        } else {
            this.segundo += 1;
        }
    }

}
