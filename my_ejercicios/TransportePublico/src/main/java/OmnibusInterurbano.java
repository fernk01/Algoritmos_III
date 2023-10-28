import java.util.HashMap;
import java.util.Map;

class OmnibusInterurbano extends MedioDeTransporte {
    private Map<String, Double> tarifasEntreDestinos;

    public OmnibusInterurbano(int precio) {
        this.tarifasEntreDestinos = new HashMap<>();
        // Configura las tarifas entre diferentes destinos
        tarifasEntreDestinos.put("A - B", 10.0);
        tarifasEntreDestinos.put("B - C", 15.0);
        // Agrega más tarifas según tus necesidades
    }

    @Override
    public double calcularCosto(String origen, String destino) {
        String ruta = origen + " - " + destino;
        if (tarifasEntreDestinos.containsKey(ruta)) {
            return tarifasEntreDestinos.get(ruta);
        } else {
            throw new IllegalArgumentException("Ruta no encontrada");
        }
    }

    @Override
    public double calcularTiempo(String origen, String destino) {
        return 1.5;
    }
}