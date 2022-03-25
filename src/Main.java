import java.util.Scanner;
import Modelo.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Almacen almacen;

    public static void main(String[] args) {
        almacen = new Almacen();
        byte opcion;

	    System.out.println("Gestimal, ahora mismo esta conectado a los servicios de DAM1");
        System.out.println("Estas son nuestras opciones: ");
        do {
            mainMenu();
            System.out.println("Por favor seleccione una opcion");
            opcion = sc.nextByte();

            if(opcion < 0 || opcion > 6){
                System.out.println("Introduzca una opcion valida por favor.");
            }else {
                switch (opcion){
                    case 0:
                        System.out.println("El programa esta finalizando");
                        break;
                    case 1:
                        System.out.println(almacen);
                        break;
                    case 2:
                        introducirArticulo();
                        break;
                    case 3:
                        suprimirArticulo();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }

            }
        }while (opcion != 0);

    }

    public static void introducirArticulo(){
        System.out.println("Inserta el codigo del articulo");
        sc.nextLine();
        String codigo = sc.nextLine();
        System.out.println("Inserta la descripcion");
        String descripcion = sc.nextLine();
        System.out.println("Inserta el precio de compra");
        double precioCompra = sc.nextDouble();
        System.out.println("Inserta el precio de venta");
        double precioVenta = sc.nextDouble();
        System.out.println("Inserta el stock");
        int numeroUnidades = sc.nextInt();
        Articulo nuevo = new Articulo(codigo, descripcion, precioCompra, precioVenta, numeroUnidades);
        almacen.insertarArticulo(nuevo);
    }

    public static void suprimirArticulo(){
        System.out.println("Inserta el codigo del articulo");
        sc.nextLine();
        String codigo = sc.nextLine();
        almacen.eliminarArticulo(codigo);
    }

    public static void modificar(){
        System.out.println("Nuevo codigo");
        sc.nextLine();
        String codigo = sc.nextLine();
        System.out.println("Nueva descripcion");
        String descripcion = sc.nextLine();
        System.out.println("Nuevo precio de compra");
        double precioCompra = sc.nextDouble();
        System.out.println("Nuevo precio de venta");
        double precioVenta = sc.nextDouble();
    }

    public static void mainMenu(){
        System.out.print("""
                1. Listado.
                2. Alta.
                3. Baja.
                4. Modificacion.
                5. Entrada de Mercancia.
                6. Salida de Mercancia.
                0. Salir.
                """);
    }
}
