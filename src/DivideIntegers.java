import java.util.Scanner;

public class DivideIntegers {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter two numbers, the first will be divided by the second three times.");

    int userNum = scn.nextInt();
    int divNum = scn.nextInt(); // change variable name
    int divResult = userNum / divNum;


    System.out.println("After 1 division: " + divResult);
    divResult = divResult / divNum;

    System.out.println("After 2 divisions: " + divResult);
    divResult = divResult/ divNum;

    System.out.println("After 3 divisions: " + divResult);
    }
}
