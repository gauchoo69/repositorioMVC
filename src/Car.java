package modelo;


public class Car {
    private motor motor;
    private tanque tanque;
    private double velocidad;
    private double consumoPorMetro;

    public Coche(double velocidad, double consumoPorMetro) {
        this.motor = new motor();
        this.tanque = new tanque();
        this.velocidad = velocidad;
        this.consumoPorMetro = consumoPorMetro;
    }

    public String avanzar(double metros) {
        double consumoNecesario = metros * velocidad * consumoPorMetro;
        if (tanque.nivel() >= consumoNecesario) {
            motor.encender();
            motor.mover();
            tanque.reducir(consumoNecesario);
            return "El coche ha avanzado " + metros + " metros.";
        } else {
            return "No hay suficiente gasolina para avanzar.";
        }
    }


    public String ponerGasolina(double litros) {
        tanque.añade(litros);
        return "Se añadieron " + litros + " litros de gasolina.";
    }
}


