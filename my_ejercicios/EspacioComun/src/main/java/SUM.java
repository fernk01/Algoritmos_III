import java.util.Date;

public class SUM {
    private EspacioComun espacioComun;  // Composición

    private static final int MAX_USOS_PROPIETARIO = 5;
    private static final int MAX_USOS_INQUILINO = 2;
    private static final int MAX_USOS_COMERCIAL = 10;

    public SUM() {
        espacioComun = new EspacioComun();
    }

    public boolean puedeUsar(Habitante habitante, Date unaFecha) {
        if (espacioComun.puedeUsar(habitante, MAX_USOS_PROPIETARIO, unaFecha) && habitante instanceof Propietario) {
            return true;
        } else if (espacioComun.puedeUsar(habitante, MAX_USOS_INQUILINO, unaFecha) && habitante instanceof Inquilino) {
            return true;
        } else if (espacioComun.puedeUsar(habitante, MAX_USOS_COMERCIAL, unaFecha) && habitante instanceof Inquilino && habitante.tieneHabitacionComercial()) {
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
