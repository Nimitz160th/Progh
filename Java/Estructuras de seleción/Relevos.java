import java.util.Scanner;
import java.util.Arrays;

public class Relevos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A que velocidad corrio Aldana");
        int Aldana = scanner.nextInt();

        System.out.println("A que velocidad corrio Pía");
        int Pía = scanner.nextInt();

        System.out.println("A que velocidad corrio María");
        int María = scanner.nextInt();

        // Colocar los valores en un array
        int[] variables = { Aldana, Pía, María };

        // Ordenar el array en orden descendente
        Arrays.sort(variables);
        int[] variablesOrdenadas = new int[3];
        for (int i = 0; i < variables.length; i++) {
            variablesOrdenadas[i] = variables[variables.length - 1 - i];
        }

        System.out.println("Corredoras ordenadas por velocidad " + variablesOrdenadas[0] + ", "
                + variablesOrdenadas[1] + ", " + variablesOrdenadas[2]);
    }
}