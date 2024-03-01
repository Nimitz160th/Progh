import java.util.Scanner;
import java.text.DecimalFormat;

public class App4 {

    public static void main(String[] args) throws Exception {
        Scanner Imput = new Scanner(System.in);
        int Tela;
        Tela = 100;
        double Elefantes;
        double Peso;
        System.out.println("¿Cuantos Elefantes se balancean en la tela de Araña?");
        Elefantes = Imput.nextInt();
        Peso = Tela / Elefantes;
        DecimalFormat formato = new DecimalFormat("#.##");
        // Esto es para poner un maximo de numeros (Lo busqué en internet
        // (ChatGPT3.0))(Solo lo de DecimalFormat)
        System.out.println(
                "En total se balancean " + Elefantes + " Elefantes y en promedio pesan " + formato.format(Peso) + "Kg");

    }
}
