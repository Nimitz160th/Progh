import java.util.Scanner;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programacion1 {
    static int totalprecio = 0;
    static int cantidad = 0;
    static int CantidadDeArticulos = 50; // Cantidad de Articulos modificable
    static int ArticulosPorPrecio;
    static int[] Articulo = new int[100];
    static int[] Precio = new int[100];
    static int[] ListaArticulo = new int[100];
    static int[] CantidarPorArticulo = new int[100];
    static int[] Stock = new int[100]; // Añadido Defensa
    static int[] DevolverStock = new int[100];// Añadido Defensa
    static Random aleatorio = new Random();
    static Scanner leer = new Scanner(System.in);
    static int opcion, opcion1;
    static int contador;

    public static void main(String[] args) {
        int Devolver, listaprecios, Generador, MenuCompra, Ticket;
        for (int i = 0; i < CantidadDeArticulos; i++) {
            Precio[i + 1] = aleatorio.nextInt(1500);
            Stock[i + 1] = aleatorio.nextInt(20); // Añadido Defensa
            DevolverStock[i + 1] = Stock[i + 1];
            System.out.println("El Carrito fue devuelto");
        }
        do {
            System.out.println("1-Ver lista de Articulos");
            System.out.println("2-comprar");
            System.out.println("3-ver cuanto llevo gastado");
            System.out.println("4-lista de  articulos comprados de cada tipo");
            System.out.println("5-Cantidad de articulos comprados");
            System.out.println("6-Terminar compra");
            System.out.println("7-Devolver carrito");
            System.out.println("0-Cancelar Compra");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Generador = GenerarListaArticulos();
                    break;
                case 2:
                    contador++;
                    MenuCompra = MenuProductos();
                    break;
                case 3:
                    System.out.println("has gastado: " + totalprecio);
                    break;
                case 4:
                    System.out.println("┌─────────────────────────────────────────┐");
                    System.out.println("|     articulos de cada tipo comprados    |");
                    System.out.println("└─────────────────────────────────────────┘");
                    listaprecios = ListaDePrecios();
                    break;
                case 5:
                    System.out.println("Cantidad de artículos comprados: " + ArticulosPorPrecio);
                    break;
                case 6:
                    Ticket = Ticket();
                    System.exit(0);
                    break;
                case 7:
                    Devolver = DevolverCarrito();
                    break;
            }
        } while (opcion != 0);
    }

    public static int DevolverCarrito() {
        int Devolver = 0;
        for (int i = 0; i < CantidadDeArticulos; i++) {
            Stock[i + 1] = DevolverStock[i + 1];
        }
        return Devolver;
    }

    public static int GenerarListaArticulos() {
        int Generador = 0;
        for (int i = 0; i < CantidadDeArticulos; i++) {
            Articulo[i + 1] = Precio[i + 1];
            System.out.println("Articulo " + (i + 1) + ": $" + Articulo[i + 1] + " Stock: " + Stock[i + 1]);
        }
        return Generador;
    }

    public static int MenuProductos() {
        int MenuCompra = 0;
        for (int i = 0; i <= 1; i++) {
            System.out.println("¿Que articulo desea comprar?");
            opcion1 = leer.nextInt();
            ListaArticulo[contador - 1] = opcion1;
            ListaArticulo[contador] = 0;
            int multiplicador = 0;

            if (opcion <= CantidadDeArticulos) {
                System.out.println("¿Cuantos desea comprar? (Maximo 100)");
                opcion = leer.nextInt();
                if (opcion > Stock[opcion1]) {
                    System.out.println("No hay stock suficiente");
                    return MenuProductos();
                }
                Stock[opcion1] = Stock[opcion1] - opcion;
                multiplicador = Articulo[opcion1];
                ArticulosPorPrecio = ArticulosPorPrecio + opcion;
                totalprecio = totalprecio + multiplicador * opcion;
                cantidad = cantidad + 1;
                CantidarPorArticulo[contador - 1] = opcion;
            } else {
                System.out.println("Error");
            }
            break;
        }
        return MenuCompra;
    }

    public static int ListaDePrecios() {
        int listaprecios = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("Articulo " + ListaArticulo[i] + "       $" + Precio[ListaArticulo[i]]);
        }
        return listaprecios;
    }

    public static int Ticket() {
        double totalprecioIVA = totalprecio * 0.22 + totalprecio;
        Date fechaActual = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        int Ticket = 0;
        int atendido;
        atendido = aleatorio.nextInt(2);
        int min = 100000;
        int max = 999999;
        int Numero = aleatorio.nextInt(999999 - 100000) + 100000;
        System.out.println("              Super LauLex              ");
        System.out.println("e-Ticket                                   ");
        System.out.println("N°" + Numero + "                        " + fecha.format(fechaActual));
        System.out.println("CONTADO                           " + hora.format(fechaActual));
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("|             CONSUMO FINAL               |");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println("MONEDA:UYU");
        for (int i = 0; i < contador; i++) {
            System.out.println("Articulo " + ListaArticulo[i] + "                            "
                    + (Precio[ListaArticulo[i]] * CantidarPorArticulo[i]) + "\n" + CantidarPorArticulo[i] + "UN x "
                    + Precio[ListaArticulo[i]]);
        }
        System.out.println("SubTotal                              " + totalprecio);
        System.out.println("Total                              " + totalprecioIVA);
        if (atendido == 1) {
            System.out.println("Atendido por Lautaro Abreu");
        } else {
            System.out.println("Atendido por Alexis Kröger");
        }
        System.out.println("-------------------------------------------");
        System.out.println("           GRACIAS POR SU COMPRA           ");
        System.out.println("-------------------------------------------");
        return Ticket;
    }
}
