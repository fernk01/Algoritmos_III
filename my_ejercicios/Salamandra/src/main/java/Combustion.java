import java.util.List;

public class Combustion {

    public int calcularContaminacion(List<Combustible> combustibles) {
        int contaminacionTotal = 0;

        for(Combustible c : combustibles) {
            contaminacionTotal += c.getContaminacion();
        }

        return contaminacionTotal;
    }

}