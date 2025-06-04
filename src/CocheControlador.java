package controlador;

import modelo.Coche;

public class CocheControlador {
    private Coche coche;

    public CocheControlador(Coche coche) {
        this.coche = coche;
    }

    public String avanzar(double metros) {
        return coche.avanzar(metros);
    }

    public String ponerGasolina(double litros) {
        return coche.ponerGasolina(litros);
    }
}


