import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1= sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2= sc.nextDouble();

        double Product= num1*num2;
        System.out.println("Product is: "+ Product);

    }
}
