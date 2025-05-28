# Práctica: Aplicación de Coche (MVC)

## Descripción

Esta aplicación simula un coche utilizando el patrón de diseño **MVC (Modelo-Vista-Controlador)**. El usuario puede realizar dos acciones principales:

- **Avanzar** una cierta cantidad de metros (disminuye la gasolina según la distancia y la velocidad).
- **Poner gasolina**, añadiendo litros al tanque del coche.

---

##  Nuevas funcionalidades implementadas

### 🔹 Avanzar (metros)
- El usuario indica cuántos metros quiere avanzar.
- Se calcula el **consumo de gasolina** según:
- - Si hay gasolina suficiente, el coche avanza y se reduce el nivel del tanque.
- Si no hay suficiente gasolina, se muestra un mensaje de error.

### 🔹 Poner gasolina (litros)
- El usuario introduce cuántos litros desea añadir.
- El tanque incrementa su nivel en esa cantidad.

---

## 🧠 Estructura MVC

- **Modelo**:
- `Coche`: contiene la lógica del avance y el llenado del tanque.
- `Motor`: representa el estado de encendido.
- `Tanque`: maneja el nivel de gasolina.
- **Controlador**:
- `CocheControlador`: recibe los comandos desde la vista y delega al modelo.
- **Vista**:
- `CocheVista`: menú en consola que permite elegir acciones y mostrar mensajes.

---

## JAVADOC

Se ha documentado el código con **Javadoc**, incluyendo:

- Descripción de cada clase y su función.
- Explicación de los métodos y sus parámetros.
- Instrucciones de uso.

Puedes generar la documentación ejecutando:

```bash
javadoc -d doc *.java


