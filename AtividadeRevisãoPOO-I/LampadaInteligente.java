public class LampadaInteligente extends Dispositivo implements Conectavel, Agendavel {
    private String cor;
    private int intensidade;

    public LampadaInteligente(int id, String local, String cor, int intensidade) {
        super(id, local);
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
        System.out.println("Cor alterada para: " + this.cor);
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
        System.out.println("Intensidade alterada para: " + this.intensidade + "%");
    }

    @Override
    public void funcionar() {
        if(estaLigado()) {
            conectarWifi();
            setCor("Azul");
            setIntensidade(75);
            agendarAtividade();
            cancelarAgendamento();
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
    public void agendarAtividade() {
        System.out.println("Atividade Agendada");
        System.out.println("Desligara automaticamente as 22:00");
    }

    @Override
    public void cancelarAgendamento() {
        System.out.println("Agendamento Cancelado");
    }

}
