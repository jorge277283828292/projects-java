package Ejercicio2;

public class Ordenador { 
    private String marca;
    private String modelo;
    private int gbRAM;
    private int capadidaDiscoDuro;
    private int espacioutilizado;
    private boolean encendido;

    public Ordenador() {
        this("", "", 4, 50);    
    }

    public Ordenador(int gbRAM) {
        this("", "", gbRAM, 50);
    }

    public Ordenador(int gbRAM, int capadidaDiscoDuro) {
        this("", "", gbRAM, capadidaDiscoDuro);
    }

    public Ordenador(String marca, String modelo, int gbRAM, int capadidaDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.gbRAM = gbRAM;
        this.capadidaDiscoDuro = capadidaDiscoDuro;
    }
}