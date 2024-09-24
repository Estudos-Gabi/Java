package  beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int NUMBER = sc.nextInt();
    int horas = sc.nextInt();
    double valor = sc.nextDouble();
    double salario = (double) horas * valor;
    System.out.printf("NUMBER = %d%n", NUMBER);
    System.out.printf("SALARY = U$ %.2f%n", salario);
  }
}
