import java.util.Scanner;
public class Bitwise_Compliment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=sc.nextInt();

        int result= ~number;
        System.out.println("Result is: " + result);
    }
}
