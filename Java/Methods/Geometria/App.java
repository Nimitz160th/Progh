import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Variable;
        int base, altura, area, area1;
        do {
            System.out.println("Si quiere hacer el area de un triangulo ingrese 1");
            System.out.println("Si quiere hacer el perimetro de un triangulo ingrese 2");
            System.out.println("Si quiere hacer el area de un cuadrado ingrese 3");
            System.out.println("Si quiere hacer el perimetro de un cuadrado ingrese 4");
            System.out.println("Si quiere salir del programa finalize 0");
            Variable = leer.nextInt();
            switch (Variable) {
                case 1:
                    base = PedirEntero();
                    altura = PedirEntero1();
                    area = base * altura;
                    area1 = area / 2;
                    System.out.println("El area del triangulo es = " + area1 + "\n");
                    break;
                case 2:
                    int lado1, lado2, lado3, perimetro;
                    lado1 = Lado1Entero();
                    lado2 = Lado2Entero();
                    lado3 = Lado3Entero();
                    perimetro = lado1 + lado2 + lado3;
                    System.out.println("El perimetro del triangulo es =" + perimetro + "\n");
                    break;
                case 3:
                    int lado1c, lado2c, areac;
                    lado1c = Lado1Enteroc();
                    lado2c = Lado2Enteroc();
                    areac = lado1c * lado2c;
                    System.out.println("El area del cuadrado es =" + areac + "\n");
                    break;
                case 4:
                    int ladoc, perimetroc;
                    ladoc = LadoEnteroc();
                    perimetroc = ladoc * 4;
                    System.out.println("El perimetro del cuadrado es =" + perimetroc + "\n");
                    break;
            }
        } while (Variable != 0);
    }

    public static int PedirEntero() {
        Scanner leer = new Scanner(System.in);
        int base;
        System.out.println("Ingrese la base del triangulo");
        base = leer.nextInt();
        return base;
    }

    public static int PedirEntero1() {
        Scanner leer = new Scanner(System.in);
        int altura;
        System.out.println("Ingrese la altura del triangulo");
        altura = leer.nextInt();
        return altura;
    }

    public static int Lado1Entero() {
        Scanner leer = new Scanner(System.in);
        int lado1;
        System.out.println("Ingrese uno de los lados del triangulo");
        lado1 = leer.nextInt();
        return lado1;
    }

    public static int Lado2Entero() {
        Scanner leer = new Scanner(System.in);
        int lado2;
        System.out.println("Ingrese uno de los lados del triangulo");
        lado2 = leer.nextInt();
        return lado2;
    }

    public static int Lado3Entero() {
        Scanner leer = new Scanner(System.in);
        int lado3;
        System.out.println("Ingrese uno de los lados del triangulo");
        lado3 = leer.nextInt();
        return lado3;
    }

    public static int Lado1Enteroc() {
        Scanner leer = new Scanner(System.in);
        int lado1c;
        System.out.println("Ingrese uno de los lados del Cuadrado");
        lado1c = leer.nextInt();
        return lado1c;
    }

    public static int Lado2Enteroc() {
        Scanner leer = new Scanner(System.in);
        int lado2c;
        System.out.println("Ingrese uno de los lados del Cuadrado");
        lado2c = leer.nextInt();
        return lado2c;
    }

    public static int LadoEnteroc() {
        Scanner leer = new Scanner(System.in);
        int ladoc;
        System.out.println("Ingrese uno de los lados del Cuadrado");
        ladoc = leer.nextInt();
        return ladoc;
    }
}