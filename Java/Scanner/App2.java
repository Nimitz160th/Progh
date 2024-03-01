import java.util.Scanner;

public class App2 {

    public static void main(String args) throws Exception {
        Scanner Input = new Scanner(System.in);
        System.out.println("¿Cuantas bandejas de galletas hizo?");
        int Bandejas = Input.nextInt();
        Bandejas = Bandejas * 25; // Multiplica la cantidad de bandejas por la cantidad de galletas en c/u
        System.out.println("¿A cuantos niños se le va a servir?");
        int Niños = Input.nextInt();
        int Galletas = Bandejas / Niños; // Divide la cantidad total de galletas y cuantas van para cada niño
        int Sobra = Bandejas % Niños; // Consigue el resto de la división

        System.out.println("Deben ser entregadas " + Galletas + " Por niño.");
        System.out.print("Sobran " + Sobra + " Galletas.");

    }

}