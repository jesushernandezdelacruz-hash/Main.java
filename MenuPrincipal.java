import java.util.Scanner;

public class MenuPrincipal {

    private Scanner sc =
        new Scanner(System.in);

    private Inventario inventario =
        new Inventario();

    public void iniciar() {

        int opcion;

        do {

            System.out.println(
                "\n================================="
            );

            System.out.println(
                "     VERDULERÍA RODRÍGUEZ"
            );

            System.out.println(
                "================================="
            );

            System.out.println(
                "1. Registrar producto"
            );

            System.out.println(
                "2. Registrar producto oferta"
            );

            System.out.println(
                "3. Ver reporte"
            );

            System.out.println(
                "4. Probar sobrecarga"
            );

            System.out.println(
                "0. Salir"
            );

            System.out.print(
                "Seleccione opción: "
            );

            opcion =
                Integer.parseInt(
                    sc.nextLine()
                );

            switch(opcion) {

                case 1:

                    registrarProducto();
                    break;

                case 2:

                    registrarOferta();
                    break;

                case 3:

                    mostrarReporte();
                    break;

                case 4:

                    probarSobrecarga();
                    break;

                case 0:

                    System.out.println(
                        "[INFO] Programa finalizado"
                    );
                    break;

                default:

                    System.out.println(
                        "[ERROR] Opción inválida"
                    );
            }

        } while(opcion != 0);
    }

    // REGISTRAR PRODUCTO

    private void registrarProducto() {

        try {

            System.out.print(
                "Nombre: "
            );

            String nombre =
                sc.nextLine();

            System.out.print(
                "Precio: "
            );

            double precio =
                Double.parseDouble(
                    sc.nextLine()
                );

            System.out.print(
                "Cantidad: "
            );

            int cantidad =
                Integer.parseInt(
                    sc.nextLine()
                );

            Producto p =
                new Producto(
                    nombre,
                    precio,
                    cantidad
                );

            inventario.agregarProducto(p);

            System.out.println(
                "[OK] Producto agregado"
            );

        } catch(Exception e) {

            System.out.println(
                "[ERROR] "
                + e.getMessage()
            );
        }
    }

    // REGISTRAR OFERTA

    private void registrarOferta() {

        try {

            System.out.print(
                "Nombre: "
            );

            String nombre =
                sc.nextLine();

            System.out.print(
                "Precio: "
            );

            double precio =
                Double.parseDouble(
                    sc.nextLine()
                );

            System.out.print(
                "Descuento (0.10): "
            );

            double descuento =
                Double.parseDouble(
                    sc.nextLine()
                );

            ProductoOferta p =
                new ProductoOferta(
                    nombre,
                    precio,
                    descuento
                );

            inventario.agregarProducto(p);

            System.out.println(
                "[OK] Producto oferta agregado"
            );

        } catch(Exception e) {

            System.out.println(
                "[ERROR] "
                + e.getMessage()
            );
        }
    }

    // REPORTE DINÁMICO

    private void mostrarReporte() {

        System.out.println(
            "\n========== REPORTE =========="
        );

        ProductoBase[] arreglo =
            inventario
            .getProductos()
            .toArray(
                new ProductoBase[0]
            );

        for(ProductoBase p : arreglo) {

            System.out.println(
                p.generarReporte()
            );
        }
    }

    // SOBRECARGA

    private void probarSobrecarga() {

        ProductoBase p =
            new ProductoBase(
                "Manzana",
                20
            );

        p.mostrarInfo();

        p.mostrarInfo(
            "=== PRODUCTO ESPECIAL ==="
        );
    }
}
