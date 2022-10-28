import java.util.Date;

public class Solicitud extends Responsable{
    private int Nro_solicitud;
    private Date fecha;

    public Solicitud(String nombre, int CI, int nro_solicitud, Date fecha) {
        super(nombre, CI);
        setNro_solicitud(nro_solicitud);
        this.setFecha(fecha);
    }

    public int getNro_solicitud() {
        return Nro_solicitud;
    }

    public void setNro_solicitud(int nro_solicitud) {
        Nro_solicitud = nro_solicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "nombre='" + nombre + '\'' +
                ", CI=" + CI +
                ", Nro_solicitud=" + Nro_solicitud +
                ", fecha=" + fecha +
                '}';
    }
}