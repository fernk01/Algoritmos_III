public class ResinaPlastica extends Combustible {

    public ResinaPlastica(int peso) {
        super(250, peso);
    }

    @Override
    public int getContaminacion() {
        return (int)Math.pow(5, this.getKilos());
    }

}