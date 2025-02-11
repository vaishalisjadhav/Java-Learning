import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Positive/Negative Number Checker");
        System.out.print("Enter number: ");
        int number=sc.nextInt();

        if(number>0){
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative number");
        }

    }
}
