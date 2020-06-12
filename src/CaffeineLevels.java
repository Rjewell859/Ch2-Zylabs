import java.util.Scanner;

public class CaffeineLevels {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("This program determines the half life of caffeine, enter a dose in milligrams: ");

        double currentMg;
        double caffeineMg;

        caffeineMg = scnr.nextDouble();
        currentMg = caffeineMg / 2;

        System.out.printf("After 6 hours: %.2f mg\n", + currentMg);
        currentMg = currentMg / 2;

        System.out.printf("After 12 hours: %.2f mg\n", + currentMg);
        currentMg = currentMg / 4;

        System.out.printf("After 24 hours: %.2f mg\n", + currentMg);

    }
}
