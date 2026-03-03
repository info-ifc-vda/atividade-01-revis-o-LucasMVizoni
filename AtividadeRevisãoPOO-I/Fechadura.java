public class Fechadura extends Dispositivo implements Conectavel, Monitoravel {
    private boolean trancado;

    public Fechadura(int id, String local, boolean trancado) {
        super(id, local);
        this.trancado = trancado;
    }

    public void setTrancado(boolean trancado) {
        this.trancado = trancado;
    }

    @Override
    public void funcionar() {
        if(estaLigado()) {
            conectarWifi();
            setTrancado(false);
            gerarRelatorio();
            setTrancado(true);
            gerarRelatorio();
            desconectarWifi();
        }else {
            System.out.println("Dispositovo desligado");
        }
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando ao Wifi ...");
        System.out.println("Conectado");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando do Wifi ...");
        System.out.println("Desconectado");
    }

    @Override
    public void gerarRelatorio() {
        if(this.trancado == true){
            System.out.println("Porta trancada");
        }else {
            System.out.println("Porta destrancada registrada");
        }
    }

}
