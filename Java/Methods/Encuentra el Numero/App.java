import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int Numero, Pista, Nuevo, Opcion;
        Scanner Leer = new Scanner(System.in);
        Random Rand = new Random();
        Numero = 1;
        Nuevo = 1;
        do {
            System.out.println("1-Iniciar Juego");
            System.out.println("2-Ingresar Numero");
            System.out.println("3-Dar Pista");
            System.out.println("0-Salir");
            Opcion = Leer.nextInt();
            switch (Opcion) {
                case 1:
                    Numero = NuevoNumero();
                    System.out.println("Juego Iniciado");
                    break;
                case 2:
                    Nuevo = IngresarNumero(Numero);
                    break;
                case 3:
                    Pista = ValorarNumero(Numero, Nuevo);
            }
        } while (Opcion != 0);
    }

    public static int NuevoNumero() {
        int Numero;
        Random Rand = new Random();
        Numero = Rand.nextInt(49);
        Numero = Numero + 1;
        return Numero;
    }

    public static int IngresarNumero(int Numero) {
        int Nuevo;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Nuevo = Leer.nextInt();
        if (Nuevo == Numero) {
            System.out.println("¡Adivinaste!");
        } else {
            System.out.println("El numero ingresado no es correcto.");
        }
        return Nuevo;
    }

    private static int ValorarNumero(int Numero, int Nuevo) {
        int Pista = 1;
        if (Numero > Nuevo) {
            System.out.println("El numero que buscas es mayor");
        }
        if (Numero < Nuevo) {
            System.out.println("El numero que buscas es Menor");
        }
        return Pista;
    }
}