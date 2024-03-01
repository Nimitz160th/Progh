import java.util.Scanner;

public class AprendiendoNumeros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 0 al 9 ");
        int numeroIngresado = scanner.nextInt();

        String nombreNumero;
        switch (numeroIngresado) {
            case 0:
                nombreNumero = "cero";
                break;
            case 1:
                nombreNumero = "uno";
                break;
            case 2:
                nombreNumero = "dos";
                break;
            case 3:
                nombreNumero = "tres";
                break;
            case 4:
                nombreNumero = "cuatro";
                break;
            case 5:
                nombreNumero = "cinco";
                break;
            case 6:
                nombreNumero = "seis";
                break;
            case 7:
                nombreNumero = "siete";
                break;
            case 8:
                nombreNumero = "ocho";
                break;
            case 9:
                nombreNumero = "nueve";
                break;
            default:
                nombreNumero = "Número inválido";
                break;
        }
        System.out.println("El número ingresado es el " + nombreNumero);
    }
}
