import java.util.ArrayList;

public class Inventario {

    private ArrayList<ProductoBase>
        productos;

    public Inventario() {

        productos =
            new ArrayList<>();
    }

    public void agregarProducto(
        ProductoBase p
    ) {

        productos.add(p);
    }

    public ArrayList<ProductoBase>
    getProductos() {

        return productos;
    }
}
