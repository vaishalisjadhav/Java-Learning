import java.util.Scanner;
public class Bitwise_OR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2= sc.nextInt();

        int result= num1 | num2;
        System.out.println("Result is: " + result);
    }
}
