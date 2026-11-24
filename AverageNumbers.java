import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            double num = scanner.nextDouble();

            if (num == -1) {
                break;
            }

            total += num;
            		count++;
            double average = total / count;
            
            System.out.println("Current average: " + average);
        }
    }
}

