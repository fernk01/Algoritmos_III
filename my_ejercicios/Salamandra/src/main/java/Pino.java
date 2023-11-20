public class Pino extends Combustible {

    public Pino(int peso) {
        super(500, peso);
    }

    @Override
    public int getContaminacion() {
        return 150;
    }

}