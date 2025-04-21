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

    

    public boolean ajustaHora(byte hora, byte minuto, byte segundo){
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Hora, minuto ou segundo inválidos.");
            return false;
        }
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;

        return true;
    }

    public byte getHora(){ 
        return this.hora;
    }

    public boolean avancaHora(){
        this.hora = (byte)((this.hora + 1) % 24);

        return true;
    }

    public boolean avancaMinuto(){
        if (this.minuto == 59) {
            avancaHora();
            this.minuto = 0;
            return true;
        } else {
            this.minuto += 1;
            return true;
        }
    }
    
    public boolean avancaSegundo(){
        if (this.segundo == 59) {
            avancaMinuto();
            this.segundo = 0;
            return true;
        } else {
            this.segundo += 1;
            return true;
        }
    }

    public boolean sincronizarCom(Relogio outroRelogio) {
        this.hora = outroRelogio.hora;
        this.minuto = outroRelogio.minuto;
        this.segundo = outroRelogio.segundo;
        return true;
    }

    public int diferencaEmSegundos(Relogio outroRelogio) {
        int totalSegundosAtual = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int totalSegundosOutro = outroRelogio.hora * 3600 + outroRelogio.minuto * 60 + outroRelogio.segundo;
    
        return Math.abs(totalSegundosAtual - totalSegundosOutro);
    }

}
