import java.util.List;
import java.util.ArrayList;
public class Salamandra {

    private List<Combustible> combustibles;
    private int capacidadMaxima = 10;

    public Salamandra() {
        this.combustibles = new ArrayList<>();
    }

    public void agregarCombustible(Combustible combustible) throws Exception {
        double totalKilos = combustible.getKilos();
        for (Combustible c : combustibles) {
            totalKilos += c.getKilos();
        }
        if (totalKilos > 10) {
            throw new Exception("La salamandra no puede operar con más de 10 kg de combustible.");
        }
        combustibles.add(combustible);
    }

    public int getPesoTotal() {
        int pesoTotal = 0;
        for(Combustible c : this.combustibles) {
            pesoTotal += c.getKilos();
        }
        return pesoTotal;
    }

    public double getCostoTotal() {
        double costoTotal = 0;
        for(Combustible madera : this.combustibles) {
            costoTotal += madera.getPrecio();
        }
        return costoTotal;
    }

    public int getContaminacion() {
        Combustion combustion = new Combustion();
        return combustion.calcularContaminacion(this.combustibles);
    }

}