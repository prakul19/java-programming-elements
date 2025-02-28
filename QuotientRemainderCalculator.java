class QuotientRemainderCalculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for two numbers
        int number1, number2;

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the results
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}

