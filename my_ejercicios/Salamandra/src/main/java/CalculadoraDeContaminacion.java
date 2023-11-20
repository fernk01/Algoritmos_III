import java.util.List;

public class CalculadoraDeContaminacion {
    public double calcularContaminacion(List<Combustible> combustibles) throws Exception {
        double contaminacion = 0;
        for (Combustible combustible : combustibles) {
            contaminacion += combustible.getContaminacion();
        }
        if (contaminacion > 500) {
            throw new Exception("La salamandra aborta su operatoria al superar los 500 gCO2 de contaminación.");
        }
        return contaminacion;
    }
}