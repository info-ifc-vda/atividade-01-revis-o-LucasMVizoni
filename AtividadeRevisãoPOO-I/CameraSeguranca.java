public class CameraSeguranca extends Dispositivo implements Conectavel, Monitoravel, Atualizavel {
    private boolean gravando;

    public CameraSeguranca(int id, String local) {
        super(id, local);
        this.gravando = false;
    }

    public void setGravando(boolean gravando) {
        this.gravando = gravando;
    }

    @Override
    public void funcionar() {
        if(estaLigado()) {
            conectarWifi();
            setGravando(true);
            gerarRelatorio();
            setGravando(false);
            atualizarFirmware();
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
        System.out.println("Entrega na porta detectada");
    }

    @Override
    public void atualizarFirmware() {
        System.out.println("Atualizando, por favor aguarde ...");
        System.out.println("Atualizado com sucesso");
    }

}