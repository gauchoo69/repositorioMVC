```mermaid
sequenceDiagram
participant Usuario
participant CocheVista
participant CocheControlador
participant Coche
participant Tanque
participant AlarmaRepostar

    Usuario->>CocheVista: Selecciona "Avanzar"
    CocheVista->>CocheControlador: avanzar(metros)
    CocheControlador->>Coche: avanzar(metros)
    Coche->>Tanque: nivel()
    alt gasolina suficiente
        Coche->>Tanque: reducir(consumo)
        Coche->>Coche: notificarObservadores()
        Coche->>AlarmaRepostar: actualizar(nivel)
        alt nivel < 10
            AlarmaRepostar->>CocheVista: Mostrar alerta " Alerta: Repostar"
        else nivel >= 10
            AlarmaRepostar-->>Coche: No hace nada
        end
        Coche-->>CocheControlador: "El coche ha avanzado X metros"
    else gasolina insuficiente
        Coche-->>CocheControlador: "No hay suficiente gasolina"
    end
    CocheControlador-->>CocheVista: Mensaje correspondiente
    CocheVista-->>Usuario: Muestra mensaje
```



# Práctica: Aplicación de Coche (MVC)

## Descripción

Esta aplicación simula un coche utilizando el patrón de diseño **MVC **. El usuario puede realizar dos acciones principales:

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

## Estructura MVC

- **Modelo**:
- `Coche`: contiene la lógica del avance y el llenado del tanque.
- `Motor`: representa el estado de encendido.
- `Tanque`: maneja el nivel de gasolina.
- **Controlador**:
- `CocheControlador`: recibe los comandos desde la vista y delega al modelo.
- **Vista**:
- `CocheVista`: menú en consola que permite elegir acciones y mostrar mensajes.

---




