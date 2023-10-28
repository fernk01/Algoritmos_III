class Tramo {
    private String puntoOrigen;
    private String puntoDestino;
    private MedioDeTransporte medioDeTransporte;

    public Tramo(String puntoOrigen, String puntoDestino, MedioDeTransporte medioDeTransporte) {
        this.puntoOrigen = puntoOrigen;
        this.puntoDestino = puntoDestino;
        this.medioDeTransporte = medioDeTransporte;
    }

    public double calcularCosto() {
        return medioDeTransporte.calcularCosto(puntoOrigen, puntoDestino);
    }

    // Algregamos Tiempo de viaje
    public double calcularTiempo() {
        return medioDeTransporte.calcularTiempo(puntoOrigen, puntoDestino);
    }
}