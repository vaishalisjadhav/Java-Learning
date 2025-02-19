import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to multiplication world\n");
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        multiplication(num);
    }

    public static void multiplication(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }
}
