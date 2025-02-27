import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial Number");
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial Is: " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
