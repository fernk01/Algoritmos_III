class TrenUrbano extends MedioDeTransporte {
    private int precioPorDistancia;

    public TrenUrbano(int precioPorDistancia) {
        this.precioPorDistancia = precioPorDistancia;
    }

    @Override
    public double calcularCosto(String origen, String destino) {
        // Implementa el cálculo de costo basado en la distancia entre estaciones
        // Puedes usar una tabla de distancias entre estaciones para hacer este cálculo.
        return precioPorDistancia * calcularDistancia(origen, destino);
    }

    private int calcularDistancia(String origen, String destino) {
        // Lógica para calcular la distancia entre estaciones
        return 10; // Supongamos que la distancia es constante para simplificar el ejemplo
    }

    @Override
    public double calcularTiempo(String origen, String destino) {
        // Implementa el cálculo de tiempo basado en la distancia entre estaciones
        // Puedes usar una tabla de distancias entre estaciones para hacer este cálculo.
        return calcularDistancia(origen, destino) * 0.5;
    }
}