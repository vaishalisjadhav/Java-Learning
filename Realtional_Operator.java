import java.util.Scanner;
public class Realtional_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to driving license portal");
        System.out.print("Please enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Cycle chala bhaiii");
        }
    }
}
