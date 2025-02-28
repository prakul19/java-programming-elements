class IntOperation {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for a, b, and c
        int a, b, c;

        // Take user input for a
        System.out.print("Enter the value of a: ");
        a = input.nextInt();

        // Take user input for b
        System.out.print("Enter the value of b: ");
        b = input.nextInt();

        // Take user input for c
        System.out.print("Enter the value of c: ");
        c = input.nextInt();

        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
        System.out.println("The result of a % b + c is " + result4);
    }
}

