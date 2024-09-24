import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        double[]  vect = new double[n];

        for (int i= 0; i< n; i++){
            System.out.println("Altura da pessoa N°"+ (i+1));
            vect[i] = sc.nextDouble();
        }

        double somando = 0;
        for(int i = 0; i<n; i++){
            somando += vect[i];

        }

        double media = somando/n;
        System.out.println(" A média das alturas é: " + media);
        sc.close();


    }
}
