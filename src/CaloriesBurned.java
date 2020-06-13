import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        double ageNum = userIn.nextDouble();
        double weightNum = userIn.nextDouble();
        double heartRate = userIn.nextDouble();
        double timeWork = userIn.nextDouble();

        System.out.print("Women: ");
        System.out.printf("%.2f", ((ageNum * 0.074) - (weightNum * 0.05741) + (heartRate * 0.4472) - 20.4022) * (timeWork / 4.184));
        System.out.println(" calories");
        System.out.print("Men: ");
        System.out.printf("%.2f", ((ageNum * 0.2017) + (weightNum * 0.09036) + (heartRate * 0.6309) - 55.0969) * (timeWork / 4.184));
        System.out.println(" calories");
    }
}
