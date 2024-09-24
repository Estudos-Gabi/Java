package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Omaior {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc;
    sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int MaiorAB = (A + B + Math.abs(A - B)) / 2;
    int MaiorC = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

    if (MaiorAB > MaiorC) {
      System.out.printf("%d eh o maior", MaiorAB);
    } else {
      System.out.printf("%d eh o maior", MaiorC);
    }

    sc.close();

  }

}
