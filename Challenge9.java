import java.util.Scanner;
public class Challenge9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Even/Odd Number Checker");
        System.out.print("Enter number: ");
        int number=sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
