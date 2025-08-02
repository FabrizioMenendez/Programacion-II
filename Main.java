// Clase base general
class Vehiculo {
    // Atributos comunes para todos los vehículos
    String marca;
    String modelo;
    int año;
    String tipoCombustible;
    String motor;
    String cabina;
    float peso;
    String color;

    // Métodos generales (comportamiento común)
    public void encender() {
        System.out.println("Vehículo encendido.");
    }

    public void frenar() {
        System.out.println("Vehículo frenando.");
    }

    public void detener() {
        System.out.println("Vehículo detenido.");
    }

    public void apagar() {
        System.out.println("Vehículo apagado.");
    }
}

// Clase intermedia: Terrestre
// Hereda de Vehiculo y añade atributos y métodos propios
class Terrestre extends Vehiculo {
    int numRuedas;

    public void reversa() {
        System.out.println("Entrando en reversa.");
    }

    public void tocarBocina() {
        System.out.println("¡BEEP BEEP!");
    }
}

// Clase intermedia: Aereo
// Especializa vehículos que vuelan, agrega nuevos atributos y métodos
class Aereo extends Vehiculo {
    float altitudMaxima;
    String tipoMotor;

    public void despegar() {
        System.out.println("Despegando...");
    }

    public void aterrizar() {
        System.out.println("Aterrizando...");
    }
}

// Clase intermedia: Acuatico
// Especializa vehículos que se desplazan en el agua
class Acuatico extends Vehiculo {
    String tipoDesplazamiento;
    boolean esSumergible;

    public void navegar() {
        System.out.println("Navegando en el agua.");
    }

    public void anclar() {
        System.out.println("Anclando el vehículo.");
    }
}

// Clase concreta: Auto
// Ejemplo de vehículo terrestre específico
class Auto extends Terrestre {
    public void activarLimpiaparabrisas() {
        System.out.println("Activando limpiaparabrisas.");
    }
}

// Clase concreta: Avion
// Ejemplo de vehículo aéreo específico
class Avion extends Aereo {
    public void abrirCompuertas() {
        System.out.println("Compuertas abiertas.");
    }

    public void activarFlaps() {
        System.out.println("Flaps activados.");
    }
}

// Clase concreta: Barco
// Ejemplo de vehículo acuático específico
class Barco extends Acuatico {
    public void activarRadar() {
        System.out.println("Radar activo.");
    }
}

// Clase principal con ejemplos
// Aquí mostramos cómo funcionan las clases y la herencia en la práctica
public class Main {
    public static void main(String[] args) {
        // Creando un objeto de tipo Auto y usando métodos heredados y propios
        Auto miAuto = new Auto();
        miAuto.encender();              // Método heredado de Vehiculo
        miAuto.reversa();               // Método de Terrestre
        miAuto.activarLimpiaparabrisas(); // Método propio de Auto

        System.out.println();

        // Creando un objeto de tipo Avion y usando métodos heredados y propios
        Avion miAvion = new Avion();
        miAvion.despegar();
