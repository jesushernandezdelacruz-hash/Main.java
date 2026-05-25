public class ProductoOferta
extends ProductoBase {

    private double descuento;

    public ProductoOferta(
        String nombre,
        double precio,
        double descuento
    ) {

        super(nombre, precio);

        setDescuento(descuento);
    }

    public double getDescuento() {

        return descuento;
    }

    public void setDescuento(
        double descuento
    ) {

        if(descuento < 0 ||
           descuento > 1) {

            throw new IllegalArgumentException(
                "Descuento inválido"
            );
        }

        this.descuento = descuento;
    }

    // MÉTODO SOBRESCRITO

    @Override
    public String generarReporte() {

        double precioFinal =
            getPrecio() -
            (getPrecio() * descuento);

        return getNombre()
            + " | Oferta | $"
            + precioFinal
            + " | Desc: "
            + (descuento * 100)
            + "%";
    }
}
