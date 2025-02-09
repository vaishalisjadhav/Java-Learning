import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all sides in cms: ");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();

        double Perimeter= a+b+c+d;
        System.out.println("Perimeter is: " + Perimeter + "cm");
    }
}
