import java.util.Scanner;
public class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st Value: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Value: ");
        int num2=sc.nextInt();

        int addition=num1+num2;
        int subtraction=num1-num2;
        int multiplication=num1*num2;
        int division=num1/num2;
        int modulus=num1%num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Divison: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
