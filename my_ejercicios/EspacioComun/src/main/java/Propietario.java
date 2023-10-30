public class Propietario extends Habitante {
    public Propietario(String id) {
        super(id);
        initialize();
    }

    @Override
    public void initialize() {
        // Establece los valores máximos permitidos para el propietario
        maxPileta = 5;
        maxSum = 5;
    }
}
