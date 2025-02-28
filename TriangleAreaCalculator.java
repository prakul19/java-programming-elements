class TriangleAreaCalculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for base and height
        double baseCm, heightCm;

        // Take user input for the base in cm
        System.out.print("Enter the base of the triangle in cm: ");
        baseCm = input.nextDouble();

        // Take user input for the height in cm
        System.out.print("Enter the height of the triangle in cm: ");
        heightCm = input.nextDouble();

        // Calculate the area in square centimeters
        double areaCm = 0.5 * baseCm * heightCm;

        // Convert area to square inches
        double areaInches = areaCm / (2.54 * 2.54);

        // Display the results
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}

