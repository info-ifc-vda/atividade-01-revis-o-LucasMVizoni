import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LampadaInteligente lampada = new LampadaInteligente(12345, "Quarto", "Amarelo", 80);
        Termostato termostato = new Termostato(54321, "Sala de TV", 25, 20);
        CameraSeguranca cameraSeguranca = new CameraSeguranca(78906, "Porta Principal");
        Fechadura fechadura = new Fechadura(76548, "Porta Secundaria", true);

        List<Dispositivo> lista = new ArrayList<>();
        lista.add(lampada);
        lista.add(termostato);
        lista.add(cameraSeguranca);
        lista.add(fechadura);

        for (Dispositivo d : lista) {
            System.out.println("================================");
            System.out.println("Dispositivo: " + d.getClass().getSimpleName());
            d.ligar();
            d.exibirStatus();
            d.funcionar();
            d.desligar();
            System.out.println("================================\n");
        }
    }
}
