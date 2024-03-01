import java.util.Scanner;

public class Planeta {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Grados;
        System.out.println("Ingrese la temperatura deseada ");
        Grados = scanner.nextInt();
        if (Grados >= 25) {
            System.out.println(
                    "Se recomienda el uso por debajo de los 25 Grados por el bien de  su  salud y la del medio ambiente.");
        }
        if (Grados <= 20) {
            System.out.println(
                    "Se recomienda el uso por encima de los 20 Grados por el bien de  su salud y la del medio ambiente.");
        }
        System.out.println("Gracias por comprar nuestro sistema de aires acondicionados");
    }

}
