import java.util.Calendar;
import java.util.Date;

public class Ingreso {
    private Date fecha;

    public Ingreso(Date fecha) {
        this.fecha = fecha;
    }

    public boolean devuelveUnoSiElHabitanteVinoMismoMes(Habitante habitante, Date unaFecha) {
        // Obtener el mes y el año de la fecha de ingreso
        Calendar calIngreso = Calendar.getInstance();
        calIngreso.setTime(fecha);
        int mesIngreso = calIngreso.get(Calendar.MONTH);
        int añoIngreso = calIngreso.get(Calendar.YEAR);

        // Obtener el mes y el año de la fecha dada
        Calendar calFecha = Calendar.getInstance();
        calFecha.setTime(unaFecha);
        int mesFecha = calFecha.get(Calendar.MONTH);
        int añoFecha = calFecha.get(Calendar.YEAR);

        // Comprobar si el ingreso ocurrió en el mismo mes y año que la fecha dada
        return mesIngreso == mesFecha && añoIngreso == añoFecha && habitante.equals(this.getHabitante());
    }

    private Habitante getHabitante() {
        return null;
    }

    public Date getFecha() {
        return fecha;
    }
}
