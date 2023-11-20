import java.util.List;
import java.util.ArrayList;
public class Salamandra {
    private List<Combustible> combustibles;
    private CalculadoraDeCostos calculadoraDeCostos;
    private CalculadoraDeContaminacion calculadoraDeContaminacion;

    public Salamandra() {
        this.combustibles = new ArrayList<Combustible>();
        this.calculadoraDeCostos = new CalculadoraDeCostos();
        this.calculadoraDeContaminacion = new CalculadoraDeContaminacion();
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

    public double calcularCosto() {
        return calculadoraDeCostos.calcularCosto(combustibles);
    }

    public double calcularContaminacion() throws Exception {
        return calculadoraDeContaminacion.calcularContaminacion(combustibles);
    }

}