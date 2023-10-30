import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EspacioComun {
    private List<Ingreso> ingresos;

    public EspacioComun() {
        ingresos = new ArrayList<>();
    }

    public boolean superaMaximo(Habitante habitante, int maximoPosible, Date unaFecha) {
        int usosEsteMes = 0;
        for (Ingreso ingreso : ingresos) {
            if (ingreso.devuelveUnoSiElHabitanteVinoMismoMes(habitante, unaFecha) == 1) {
                usosEsteMes++;
            }
        }
        return usosEsteMes >= maximoPosible;
    }

    public Habilitacion[] ingresosPara(Habitante habitante) {
        List<Habilitacion> habilitaciones = new ArrayList<>();
        for (Ingreso ingreso : ingresos) {
            if (ingreso.devuelveUnoSiElHabitanteVinoMismoMes(habitante, ingreso.getFecha()) == 1) {
                habilitaciones.add(new Habilitacion());
            }
        }
        return habilitaciones.toArray(new Habilitacion[0]);
    }

    public boolean puedeUsar(Habitante habitante, int maximoPosible, Date unaFecha) {
        if (!superaMaximo(habitante, maximoPosible, unaFecha)) {
            ingresos.add(new Ingreso(unaFecha));
            return true;
        }
        return false;
    }
}
