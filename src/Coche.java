package modelo;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    private Motor motor;
    private Tanque tanque;
    private double velocidad;
    private double consumoPorMetro;
    private List<Observador> observadores;

    public Coche(double velocidad, double consumoPorMetro) {
        this.motor = new Motor();
        this.tanque = new Tanque();
        this.velocidad = velocidad;
        this.consumoPorMetro = consumoPorMetro;
        this.observadores = new ArrayList<>();
    }

    public void añadirObservador(Observador obs) {
        observadores.add(obs);
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.actualizar(tanque.nivel());
        }
    }

    public String avanzar(double metros) {
        double consumoNecesario = metros * velocidad * consumoPorMetro;
        if (tanque.nivel() >= consumoNecesario) {
            motor.encender();
            motor.mover();
            tanque.reducir(consumoNecesario);
            notificarObservadores();
            return "El coche ha avanzado " + metros + " metros.";
        } else {
            return "No hay suficiente gasolina para avanzar.";
        }
    }

    public String ponerGasolina(double litros) {
        tanque.añade(litros);
        notificarObservadores();
        return "Se añadieron " + litros + " litros de gasolina.";
    }
}

