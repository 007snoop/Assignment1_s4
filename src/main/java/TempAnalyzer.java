import java.util.Scanner;

public class TempAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of days: ");
        int numDays = scanner.nextInt();

        int[] temps = new int[numDays];
        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.printf("Enter temp for day " + (i + 1) + ": ");
            temps[i] = scanner.nextInt();

            sum += temps[i];
        }

        double average = (double) sum / numDays;
        System.out.printf("\nAverage temperature: " + average);

        int countAboveAverage = 0;
        for (int temp : temps) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.printf("\nNumber of days above average temperature: " + countAboveAverage);
    }
}
