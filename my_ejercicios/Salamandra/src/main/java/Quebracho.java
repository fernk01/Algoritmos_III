public class Quebracho extends Combustible {

    public Quebracho(int peso) {
        super(1000, peso);
    }

    @Override
    public int getContaminacion() {
        return this.getKilos() * 5;
    }

}