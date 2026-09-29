import java.util.Scanner;
 public class Ex3{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Donner moi la temperature en Celsius: ");
        Double Celsius=scanner.nextDouble();
        System.out.println("la temperature en Fahrenheit est:"+(Celsius*9/5)+32);
    }
 }