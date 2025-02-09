import java.util.Scanner;
public class Shorthand_Operator {
    public static void main(String[] args) {
        int a = 5;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a1 = sc.nextInt();
        a = a + a1;
        System.out.println(a);

        System.out.print("Enter 2nd number: ");
        int a2 = sc.nextInt();
        a = a + a2;
        System.out.println(a);

        System.out.print("Enter 3rd number: ");
        int a3 = sc.nextInt();
        a = a + a3;
        System.out.println(a);

        System.out.print("Enter 4th number: ");
        int a4 = sc.nextInt();
        a = a + a4;
        System.out.println(a);
    }
}
