import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        greet();

        int num1=readNum();
        int num2=readNum();

        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }

    public static int readNum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        return num;
    }

    public static void greet(){
        System.out.println("Welcom to calculator");
    }
}
