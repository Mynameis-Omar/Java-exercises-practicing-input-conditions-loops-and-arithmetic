import java.util.Scanner;

public class Somme {

    public static boolean premium(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = read.nextInt();

        int somme = 0;

        for (int i = 2; i <= n; i++) {

            if (premium(i)) {
                somme += i;
            }
        }

        System.out.println("Somme = " + somme);

        read.close();
    }
}