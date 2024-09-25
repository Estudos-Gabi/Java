package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class DoisPontos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double[] x = new double[2];
    double[] y = new double[2];

    for (int i = 0; i < 2; i++) {
      x[i] = sc.nextDouble();
      y[i] = sc.nextDouble();
    }

    double distancia = Math.sqrt(
        Math.pow((x[1] - x[0]), 2) +
            Math.pow((y[1] - y[0]), 2));

    System.out.printf("%.4f%n", distancia);
  }

}