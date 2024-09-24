package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Cha {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int contador = 0;
        int[] abcde = new int[5];
        for (int i = 0; i < 5; i++) {
            abcde[i] = sc.nextInt();
            if(abcde[i] == T){
                contador += 1;
            }
        }
        System.out.println(contador);


    }


}