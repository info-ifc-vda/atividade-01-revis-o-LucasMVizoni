

public abstract class Dispositivo {
    private int id;
    private String local;
    private boolean ligado;

    public Dispositivo(int id, String local) {
        this.id = id;
        this.local = local;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Ligando");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando");
    }

    public boolean estaLigado() {
        return ligado;
    }
    
    public void exibirStatus() {
        System.out.println("==Status==");
        System.out.println("ID: " + id);
        System.out.println("Local: " + local);
        System.out.println("Ligado: " + ligado);
    }

    public abstract void funcionar();
}