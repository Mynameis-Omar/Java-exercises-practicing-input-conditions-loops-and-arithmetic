import java.util.Scanner;

public class Ex6recur {
    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Donner un entier a : ");
        int a = read.nextInt();
        int Absa = Math.abs(a);
        System.out.print("Donner un entier b : ");
        int b = read.nextInt();
        int Absb= Math.abs(b);
        System.out.println("PGCD = " + pgcd(Absa, Absb));
        read.close();
    }
}