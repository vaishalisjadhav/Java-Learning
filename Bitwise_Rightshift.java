import java.util.Scanner;

public class Bitwise_Rightshift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= sc.nextInt();

        int result= num >> 1;
        System.out.println("Result: " + result);
    }
}
