package udemy;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] quartos = new int[10];
        System.out.println("Quantas pessoas vão alugar? ");
        int N = sc.nextInt();
        if(N >= 1 && N <=10 ){

            for (int i = 1; i < N; i++) {
                System.out.printf("Pessoa N°%d escolha o quarto:\n ", (i+1));
                 int quarto = sc.nextInt();
                 quartos[quarto] = i;

            }

            for(int i = 0; i < quartos.length; i++){
                System.out.print(quartos[i] + " ");
            }



        }

    }
}
