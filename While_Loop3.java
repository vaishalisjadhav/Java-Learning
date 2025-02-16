import java.util.Scanner;

public class While_Loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i<=5){
            int num= sc.nextInt();
            System.out.println("Number is: " + num);
            i++;
        }
    }
}
