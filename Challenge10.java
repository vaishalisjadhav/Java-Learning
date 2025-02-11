import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Greater Number Finder");
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int num3= sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("Greater Number is " + num1);
        } else if (num2>=num1 && num2>=num3){
            System.out.println("Greater number is " + num2);
        } else {
            System.out.println("Greater number is " + num3);
        }
    }
}