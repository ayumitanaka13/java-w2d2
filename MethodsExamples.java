import java.util.Scanner;

public class MethodsExamples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println(addNumbers(x, y));

    }

    public static int addNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // public static double addNumbers(double num1, double num2) {
    //     double result = num1 + num2;
    //     return result;
    // }
    
}