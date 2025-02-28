import java.util.Scanner;

public class FeetsToMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / (1760 * 3);

        System.out.println("The distance in feet is " + distanceInFeet + ", in yards is " + distanceInYards + ", and in miles is " + distanceInMiles);
    }
}

