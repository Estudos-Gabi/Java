package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBOnus {
  public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc;
      sc = new Scanner(System.in);
      @SuppressWarnings("unused")
      String nome = sc.nextLine();
      double salarioFixo = sc.nextDouble();
      double totalVendas = sc.nextDouble();
      double comissao =  0.15 * totalVendas;
      double  total = comissao + salarioFixo;
      System.out.printf("TOTAL = R$ %.2f%n", total);
      sc.close();
   }
}
