import java.util.Scanner;
public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Compound interest calculator");

        System.out.print("Enter principle amount Rs: ");
        int principle=sc.nextInt();

        System.out.print("Enter rate of interest: ");
        float rate=sc.nextFloat();

        System.out.print("How many years are you borrowing this amount?: ");
        float years= sc.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rate / 100), years);  //Years on Power
        System.out.println("Compond Interest: " + compoundInterest);
    }
}
