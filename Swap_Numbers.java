import java.util.Scanner;
public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a= sc.nextInt();

        System.out.print("Enter value of b: ");
        int b= sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);

    }
}
