public abstract class Habitante {
    int maxPileta;
    int maxSum;

    private String id;

    public Habitante(String id) {
        this.id = id;
        maxPileta = 0; // Establece el valor adecuado
        maxSum = 0;    // Establece el valor adecuado
    }

    public abstract void initialize(); // Método abstracto para inicializar atributos específicos de Propietario o Inquilino

    public boolean puedeReservar(Sala espacio, Fecha unaFecha) {
        int maximoPosible = espacio instanceof HabitacionComercial ? 10 : espacio instanceof Propietario ? maxSum : maxSum / 2;
        return espacio.puedeUsar(this, maximoPosible, unaFecha);
    }

    public boolean puedeReservar(SUM espacio, Fecha unaFecha) {
        int maximoPosible = espacio instanceof HabitacionComercial ? 10 : espacio instanceof Propietario ? maxSum : maxSum / 2;
        return espacio.puedeUsar(this, maximoPosible, unaFecha);
    }

    public boolean puedeReservar(Piscina espacio, Fecha unaFecha) {
        int maximoPosible = espacio instanceof HabitacionComercial ? 10 : espacio instanceof Propietario ? maxPileta : maxSum / 2;
        return espacio.puedeUsar(this, maximoPosible, unaFecha);
    }
}
