import java.util.Scanner;

public class Futbol {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Gol1;
        int Gol2;
        System.out.println("Cuntos goles marcó nuestro equipo");
        Gol1 = scanner.nextInt();
        System.out.println("Cuantos goles marcó el equipo rival");
        Gol2 = scanner.nextInt();
        if (Gol1 > Gol2) {
            System.out.println("Nuestro equipo ganó 3 puntos hoy");
            if (Gol1 == Gol2) {
                System.out.println("Nuestro equipo ganó 1 punto hoy");
            }
        } else {
            System.out.println("Nuestro equipo no ganó puntos hoy");
        }
    }
}