package controlador;


public class CocheControlador {


    public CocheControlador(coche coche) {

    }

    public String avanzar(double metros) {
        return coche.avanzar(metros);
    }

    public String ponerGasolina(double litros) {
        return coche.ponerGasolina(litros);
    }
}


