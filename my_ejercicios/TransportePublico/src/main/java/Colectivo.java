class Colectivo extends MedioDeTransporte {
    private int precioFijo;

    public Colectivo(int precioFijo) {
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularCosto(String origen, String destino) {
        return precioFijo;
    }

    @Override
    public double calcularTiempo(String origen, String destino) {
        return 0.5;
    }
}