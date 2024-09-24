package beecrowd;

import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int t = sc.nextInt();
        int l3 = t;
        if(t >= 1 && t <= 1000){
           int  l2 = l3 * 2;
           int  l1 = l2 * 2;
            System.out.println(l1);
        }

        sc.close();
    }
}
