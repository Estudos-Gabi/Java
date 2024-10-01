package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(N);


        if (N > 0 && N < 1000000) {

            int cem = 0;
            int cinquenta = 0;
            int vinte = 0;
            int dez = 0;
            int cinco = 0;
            int dois = 0;
            int um = 0;

            for (int i = 0; N != 0; i++) {

                if (N >= 100) {
                    N -= 100;
                    cem += 1;
                }
                if (N >= 50 && N < 100) {
                    N -= 50;
                    cinquenta += 1;
                }
                if (N >= 20 && N < 50) {
                    N -= 20;
                    vinte += 1;
                }
                if (N >= 10 && N < 20) {
                    N -= 10;
                    dez += 1;
                }
                if (N >= 5 && N < 10) {
                    N -= 5;
                    cinco += 1;
                }

                if (N >= 2 && N < 5) {
                    N -= 2;
                    dois += 1;
                }
                if (N == 1) {
                    N -= 1;
                    um += 1;
                }


            }
            System.out.printf("%d nota(s) de R$ 100,00 %n", cem);
            System.out.printf("%d nota(s) de R$ 50,00 %n", cinquenta);
            System.out.printf("%d nota(s) de R$ 20,00 %n", vinte);
            System.out.printf("%d nota(s) de R$ 10,00 %n", dez);
            System.out.printf("%d nota(s) de R$ 5,00 %n", cinco);
            System.out.printf("%d nota(s) de R$ 2,00 %n", dois);
            System.out.printf("%d nota(s) de R$ 1,00 %n", um);

        }
        sc.close();
    }
}
