import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Donner un entier a : ");
        int a = read.nextInt();
        int Absa = Math.abs(a);
        System.out.print("Donner un entier b : ");
        int b = read.nextInt();
        int Absb= Math.abs(b);
        while (Absb != 0) {
            int reste = Absa % Absb;
            Absa = Absb;
            Absb = reste;
        }

        System.out.println("PGCD = " + Absa);
        read.close();
    }
}