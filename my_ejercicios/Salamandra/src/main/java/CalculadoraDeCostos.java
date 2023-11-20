import java.util.List;

public class CalculadoraDeCostos {
    public double calcularCosto(List<Combustible> combustibles) {
        double costo = 0;
        for (Combustible combustible : combustibles) {
            costo += combustible.getPrecio();
        }
        return costo;
    }
}