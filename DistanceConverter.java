class DistanceConverter {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create a variable to store user input for the distance in feet
        double distanceInFeet;

        // Take user input for the distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / (1760 * 3);

        // Display the results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}

