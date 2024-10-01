package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double gasto = ( (double)velocidadeMedia * (double)tempo) / 12.0;
        System.out.printf("%.3f%n",gasto);

        sc.close();
    }
}
