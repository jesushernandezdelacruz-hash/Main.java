public class Producto
extends ProductoBase {

    private int cantidad;

    public Producto(
        String nombre,
        double precio,
        int cantidad
    ) {

        super(nombre, precio);

        setCantidad(cantidad);
    }

    public int getCantidad() {

        return cantidad;
    }

    public void setCantidad(
        int cantidad
    ) {

        if(cantidad < 0) {

            throw new IllegalArgumentException(
                "Cantidad inválida"
            );
        }

        this.cantidad = cantidad;
    }

    // MÉTODO SOBRESCRITO

    @Override
    public String generarReporte() {

        return getNombre()
            + " | Producto | $"
            + getPrecio()
            + " | Stock: "
            + cantidad;
    }
}
