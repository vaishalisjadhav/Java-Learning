import java.util.Scanner;
public class Logical_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.print("Please enter your age: ");
        int age=sc.nextInt();

        System.out.print("Are you a feamle? (true/false): ");
        boolean isFemale=true;

        if (age<5){
            System.out.println("You got 75% dicount");
        } else if (isFemale){
            System.out.println("You got 50% discount");
        } else if(age>60 && !isFemale){
            System.out.println("You got 25% dicount");
        } else {
            System.out.println("You got no discount");
        }

    }
}
