import java.util.Scanner;
public class Ex7{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Donnez moi un entier x en secondes: ");
        int x=read.nextInt();
        System.out.print("cette nombre en seconde x =" +x);
        int hr=x/3600;
        int res=x%3600;
    System.out.print("est en "+hr+"heures "+res/60+"minutes "+ res%60+ " secondes ");


    }
}