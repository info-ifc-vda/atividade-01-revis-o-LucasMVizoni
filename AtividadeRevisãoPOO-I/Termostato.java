public class Termostato extends Dispositivo implements Conectavel, Monitoravel{
    private int temperaturaAlvo;
    private int temperaturaAtual;

    public Termostato(int id, String local, int temperaturaAlvo, int temperaturaAtual) {
        super(id, local);
        this.temperaturaAlvo = temperaturaAlvo;
        this.temperaturaAtual = temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    @Override
    public void funcionar() {
        if(estaLigado()) {
            conectarWifi();
            gerarRelatorio();
            setTemperaturaAtual(25);
            gerarRelatorio();
            desconectarWifi();
        }else {
            System.out.println("Dispositivo desligado");
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
        if(this.temperaturaAlvo > temperaturaAtual) {
            System.out.println("Temperatura abaixo do alvo, ligando aquecedor");
        }else {
            System.out.println("Temperatura alvo atingido, desligando aquecedor");
        }
    }

}
