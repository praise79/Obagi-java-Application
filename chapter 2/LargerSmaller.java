import java.util.Scanner;

public class LargerSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger.");
            System.out.println(num2 + " is smaller.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger.");
            System.out.println(num1 + " is smaller.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}
