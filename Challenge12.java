import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Grading");
        System.out.print("Enter percentage: ");
        float per=sc.nextFloat();

        if(per >= 90){
            System.out.println("Congrats, You got A grade");
        } else if (per >= 75) {
            System.out.println("Good, You got B grade");
        } else if (per >= 60) {
            System.out.println("You got grade C");
        } else if (per >= 35) {
            System.out.println("You got grade D");
        } else {
            System.out.println("Sorry, You have failed");
        }
    }
}
