import java.util.ArrayList;
import java.util.List;

public class Pasaje {

    protected Tramo tramo;
    protected List<ServicioAdicional> serviciosAdicionales;

    public Pasaje(Tramo tramo) {
        this.tramo = tramo;
        this.serviciosAdicionales = new ArrayList<>();
    }

    public void agregarServicioAdicional(ServicioAdicional servicioAdicional) {
        if (servicioAdicional.esCompatibleCon(tramo.tren)) {
            serviciosAdicionales.add(servicioAdicional);
        }
    }