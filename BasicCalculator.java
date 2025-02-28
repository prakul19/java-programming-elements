class BasicCalculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for two numbers
        double number1, number2;

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}

