public class ProductoBase {

    private String nombre;
    private double precio;

    public ProductoBase(
        String nombre,
        double precio
    ) {

        setNombre(nombre);
        setPrecio(precio);
    }

    // GETTERS Y SETTERS

    public String getNombre() {

        return nombre;
    }

    public void setNombre(
        String nombre
    ) {

        if(nombre == null ||
           nombre.trim().isEmpty()) {

            throw new IllegalArgumentException(
                "Nombre inválido"
            );
        }

        this.nombre = nombre;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(
        double precio
    ) {

        if(precio <= 0) {

            throw new IllegalArgumentException(
                "Precio inválido"
            );
        }

        this.precio = precio;
    }

    // POLIMORFISMO ESTÁTICO

    public void mostrarInfo() {

        System.out.println(
            nombre + " $" + precio
        );
    }

    // SOBRECARGA

    public void mostrarInfo(
        String mensaje
    ) {

        System.out.println(
            mensaje
        );

        System.out.println(
            nombre + " $" + precio
        );
    }

    // POLIMORFISMO DINÁMICO
    
    public String generarReporte() {

        return nombre +
               " | $" +
               precio;
    }
}
