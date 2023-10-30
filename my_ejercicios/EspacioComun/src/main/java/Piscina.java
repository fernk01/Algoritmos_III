import java.util.Date;

public class Piscina {
    private EspacioComun espacioComun;  // Composición

    private static final int MAX_USOS_PROPIETARIO = 5;
    private static final int MAX_USOS_INQUILINO = 10;

    public Piscina() {
        espacioComun = new EspacioComun();
    }

    public boolean puedeUsar(Habitante habitante, int maximoPosible, Date unaFecha) {
        if (espacioComun.puedeUsar(habitante, maximoPosible, unaFecha) && habitante instanceof Propietario) {
            return true;
        } else if (espacioComun.puedeUsar(habitante, maximoPosible, unaFecha) && habitante instanceof Inquilino) {
            return true;
        }
        return false;
    }

    public boolean superaMaximo(Habitante habitante, int maximoPosible, Date unaFecha) {
        return espacioComun.superaMaximo(habitante, maximoPosible, unaFecha);
    }

    public Habilitacion[] ingresosPara(Habitante habitante) {
        return espacioComun.ingresosPara(habitante);
    }
}
