// Clase principal: Avion
public class Avion {
    private String matricula;
    private String modelo;
    private int capacidadPasajeros;
    private String estado; // Ejemplo: "En vuelo", "Estacionado"
    private double velocidadActual;
    private double altitud;
    private double nivelCombustible;

    public Avion(String matricula, String modelo, int capacidadPasajeros, double velocidadActual, double altitud, double nivelCombustible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadActual = velocidadActual;
        this.altitud = altitud;
        this.nivelCombustible = nivelCombustible;
        this.estado = "Estacionado";
    }

    public void despegar() {
        this.estado = "En vuelo";
        System.out.println("El avion ha despegado.");
    }

    public void aterrizar() {
        this.estado = "Estacionado";
        System.out.println("El avion ha aterrizado.");
    }

    public void ascender(double valor) {
        this.altitud += valor;
        System.out.println("El avion ha ascendido a " + this.altitud + " metros.");
    }

    public void descender(double valor) {
        this.altitud -= valor;
        System.out.println("El avion ha descendido a " + this.altitud + " metros.");
    }

    public void aumentarVelocidad(double valor) {
        this.velocidadActual += valor;
        System.out.println("La velocidad actual del avion es " + this.velocidadActual + " km/h.");
    }

    public void reducirVelocidad(double valor) {
        this.velocidadActual -= valor;
        System.out.println("La velocidad actual del avion es " + this.velocidadActual + " km/h.");
    }

    public void consumirCombustible(double cantidad) {
        this.nivelCombustible -= cantidad;
        System.out.println("El nivel de combustible es ahora " + this.nivelCombustible + " litros.");
    }

    public String verificarSistema() {
        System.out.println("Verificando el sistema del avion...");
        return "Sistema operativo con normalidad.";
    }

    // Getters y setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(double velocidadActual) { this.velocidadActual = velocidadActual; }

    public double getAltitud() { return altitud; }
    public void setAltitud(double altitud) { this.altitud = altitud; }

    public double getNivelCombustible() { return nivelCombustible; }
    public void setNivelCombustible(double nivelCombustible) { this.nivelCombustible = nivelCombustible; }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear un nuevo avión
        Avion avion = new Avion("DHW052", "A17", 150, 0, 0, 1000);

        // Verificar el estado del avión
        System.out.println("Estado inicial del avión: " + avion.getEstado());

        // Realizar algunas acciones
        avion.despegar();
        avion.aumentarVelocidad(250);
        avion.ascender(5000);
        avion.consumirCombustible(50);
        avion.descender(3000);
        avion.aterrizar();

        // Verificar el sistema
        System.out.println(avion.verificarSistema());
    }
}
