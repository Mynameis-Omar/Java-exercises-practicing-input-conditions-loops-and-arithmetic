import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n = 0;

        while (n <= 0) {
            System.out.print("Donnez n : ");
            n = read.nextInt();
        }

        int[] tab = new int[n];

        // Remplissage
        for (int i = 0; i < n; i++) {
            System.out.print("Remplir t[" + i + "] : ");
            tab[i] = read.nextInt();
        }

        // Afficher les négatifs ensemble
        System.out.print("Le/Les nombre/s negatif/s est/sont : ");

        for (int i = 0; i < n; i++) {
            if (tab[i] < 0) {
                System.out.print(tab[i] + " ");
            }
        }

        read.close();
    }
}