import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        System.out.print("Enter principle amount Rs: ");
        int principle=sc.nextInt();
        System.out.print("Enter rate of interest: ");
        float rate=sc.nextFloat();
        System.out.print("How many years are you borrowing this money?: ");
        float years=sc.nextFloat();

        float interest= (principle * rate * years)/100;
        System.out.println("\n\n Simple interest is Rs: "+ interest);
    }
}
