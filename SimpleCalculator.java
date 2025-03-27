import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum6to8 = numbers[5] + numbers[6] + numbers[7];
        int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8];
        int result = sum4to9 - sum6to8;
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
