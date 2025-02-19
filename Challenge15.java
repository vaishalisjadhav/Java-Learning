import java.util.Scanner;

public class Challenge15 {
    // Odd sum
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int sum=sumOfOddNum(num);
        System.out.println("Odd Sum till " + num + " is: " + sum);
    }

    public static int sumOfOddNum(int num) {
        int sum=0;
        int i=1;

        while(i<=num){
            sum=sum+i;
            i=i+2;
        }
         return sum;
    }
}
