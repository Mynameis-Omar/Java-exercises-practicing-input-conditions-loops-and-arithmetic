import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Donner moi un entier x : ");
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();
        int somme = 0;
        while (n != 0) {
            somme = somme + n % 10;
            n = n / 10;
        }
        System.out.println("Somme = " + somme);
        read.close();
    }
}