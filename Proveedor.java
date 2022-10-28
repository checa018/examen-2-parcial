public class Proveedor {
    protected int NIT;
    protected String nombre_pro;

    public Proveedor(int NIT, String nombre_pro) {
        this.setNIT(NIT);
        this.setNombre_pro(nombre_pro);
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }
}
