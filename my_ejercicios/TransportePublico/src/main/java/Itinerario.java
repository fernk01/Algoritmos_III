import java.util.ArrayList;
import java.util.List;

class Itinerario {
    private List<Tramo> tramos = new ArrayList<>();

    public void agregarTramo(Tramo tramo) {
        tramos.add(tramo);
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Tramo tramo : tramos) {
            costoTotal += tramo.calcularCosto();
        }
        return costoTotal;
    }
}

