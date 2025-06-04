package modelo;

public class Tanque {
    private double nivel;

    public Tanque() {
        this.nivel = 20.0;
    }

    public double nivel() {
        return nivel;
    }

    public void añade(double litros) {
        nivel += litros;
    }

    public void reducir(double cantidad) {
        nivel -= cantidad;
        if (nivel < 0) nivel = 0;
    }
}

