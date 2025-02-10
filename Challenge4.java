import java.util.Scanner;
public class Challenge4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Area of triangle");
        System.out.print("Enter base in cms: ");
        double base=sc.nextDouble();
        System.out.print("Enter perpendicular height in cms: ");
        double height=sc.nextDouble();

        double area= 0.5*base*height;
        System.out.println("Area of triangle: " + area +" cms2");

    }
}
