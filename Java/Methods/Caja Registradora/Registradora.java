import java.util.Scanner;

public class Registradora {
    public static void main(String[] args) throws Exception {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero que tiene");
        int Presupuesto, fruta1, fruta2, frutamulti, Opcion;
        Presupuesto = Teclado.nextInt();
        fruta1 = 100;
        fruta2 = 200;
        frutamulti = 160;
        do {
            System.out.println("Saldo restante :" + Presupuesto);
            System.out.println("1. Jugo frutal 1 fruta a elección $100");
            System.out.println("2. Jugo frutal 2 frutas a elección $150");
            System.out.println("3. Jugo frutal multifruta $160");
            System.out.println("0. Comprar");
            Opcion = Teclado.nextInt();
            switch (Opcion) {
                case 1:
                    if (Presupuesto >= 100) {
                        Presupuesto = Presupuesto - fruta1;
                        System.out.println("¡Jugo frutal de 1 fruta añadido a la cesta!");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 2:
                    if (Presupuesto >= 150) {
                        Presupuesto = Presupuesto - fruta2;
                        System.out.println("¡Jugo frutal de 2 frutas añadido a la cesta!");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    if (Presupuesto >= 1600) {
                        Presupuesto = Presupuesto - frutamulti;
                        System.out.println("¡Jugo frutal multifruta añadido a la cesta!");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
            }

        } while (Opcion != 0);
    }
}