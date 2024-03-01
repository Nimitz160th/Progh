package arrays;

import java.util.Random;
import java.text.DecimalFormat;

public class Clima {
    public static void main(String[] args) throws Exception {
        int Dia[] = new int[30];
        Random rand = new Random();
        DecimalFormat formato = new DecimalFormat("#.#"); // Esto es para que el promedio solo tenga 1 valor despúes de
                                                          // la ","
        int Suma = 0;
        double promedio;
        for (int i = 0; i < 30; i++) {
            Dia[i] = rand.nextInt(30);
            System.out.println("Temperatura del Día" + (i + 1) + ":" + Dia[i] + "°C");

        }
        for (int Clima : Dia) {
            Suma += Clima;
        }
        promedio = (double) Suma / Dia.length;
        String promedioF = formato.format(promedio);
        System.out.println("El promedio te temperatura es :" + promedioF + "°C");
    }

}
