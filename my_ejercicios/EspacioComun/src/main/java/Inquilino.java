public class Inquilino extends Habitante {

    public Inquilino(String id) {
        super(id, 10, 2); // MaxPileta = 10, MaxSum = 2 según el enunciado
    }

    @Override
    public void initialize() {
        // Inicialización específica para inquilino si es necesaria
    }
}
