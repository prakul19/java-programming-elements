class TotalPriceCalculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Create variables to store user input for unit price and quantity
        double unitPrice;
        int quantity;

        // Take user input for the unit price
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        // Take user input for the quantity
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}

