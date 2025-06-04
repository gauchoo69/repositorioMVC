
package modelo;

public class AlarmaRepostar implements Observador {
    @Override
    public void actualizar(double nivelGasolina) {
        if (nivelGasolina < 10) {
            System.out.println("  Alerta: Repostar");
        }
    }
}

