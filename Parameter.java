public class Parameter {
    public static void main(String[] args) {
//        int num= sumOfTwoNum(5, 15);
//        System.out.println("Sum: " + num);
        System.out.println(sumOfTwoNum(10,20));
        System.out.println(sumOfTwoNum(15,20));
        System.out.println(sumOfTwoNum(20,20));
    }

    public static int sumOfTwoNum(int num1, int num2){
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
        int sum=num1+num2;
        return sum;
    }
}
