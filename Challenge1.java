import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter value of b: ");
        int b= sc.nextInt();

        int sum= a+b;
        int sub= a-b;
        int mult= a*b;
        int div= a/b;
        int mod= a%b;

        System.out.println("Sum: " +sum);
        System.out.println("Sub: " +sub);
        System.out.println("Mult: " +mult);
        System.out.println("Div: " +div);
        System.out.println("Mod: " +mod);
    }
}
