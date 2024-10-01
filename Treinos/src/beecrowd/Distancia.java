package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int distancia = 2 * X;

        System.out.printf("%d minutos%n", distancia);

        sc.close();
    }
}
