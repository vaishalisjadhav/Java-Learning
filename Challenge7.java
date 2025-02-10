import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Temprature Converter");

        System.out.print("Enter temp in F: ");
        float fah = sc.nextFloat();

        float cel=(fah-32)* 5.0F / 9.0F;
        System.out.println("Temprature is: " + cel +"C");
    }
}
