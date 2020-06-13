import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double mileGallon = scnr.nextDouble();
        double dollarGallon = scnr.nextDouble();
        double dollarMile = dollarGallon/mileGallon;
        int distTravel = 20;

        System.out.printf("%.2f", (dollarMile)*distTravel);
        System.out.print(" ");
        distTravel = 75;
        System.out.printf("%.2f", (dollarMile)*distTravel);
        System.out.print(" ");
        distTravel = 500;
        System.out.printf("%.2f", (dollarMile)*distTravel);
        System.out.println();
    }


}