import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        int sum = a + b;
        double average = sum / 2.0;
        int remainder = a % b;

        System.out.print("Sum = "+ sum);
        System.out.printf("Average = %.2f\n", average);
        System.out.print("Reminder =" + remainder);

    }
}