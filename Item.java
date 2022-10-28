public class Item extends Bien{
    private String cantidad_Despachada;

    public Item(int codigo_bien, String nombre_bien, int cantidad_solicitada, int unidad_medida, int valor_unitario, int valor_total, String cantidad_Despachada) {
        super(codigo_bien, nombre_bien, cantidad_solicitada, unidad_medida, valor_unitario, valor_total);
        this.setCantidad_Despachada(cantidad_Despachada);
    }

    public String getCantidad_Despachada() {
        return cantidad_Despachada;
    }

    public void setCantidad_Despachada(String cantidad_Despachada) {
        this.cantidad_Despachada = cantidad_Despachada;
    }
}
