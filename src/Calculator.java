import java.util.Scanner;
import java.util.ArrayList; // lists

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // greeting
        System.out.println("Welcome to Morsalin's Tip Calculator!");
        System.out.print("How many people are in your group: ");
        int group = scan.nextInt();
        scan.nextLine(); // extra line so code runs as intended
        // asks for percentage of tip from total cost
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine(); // extra line so code runs as intended
        System.out.print("How much money do you have?: "); // Freestyle
        double cash = scan.nextDouble();
        scan.nextLine(); // extra line so code runs as intended

        // these variables will be changed in the while loop
        double cost = 0.0;
        double totalCost = 0.0;
        ArrayList<String> items = new ArrayList<>(); // list of items ordered
        // this loop asks the user for items they order and their price
        // runs till user inputs -1
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();

            if (cost != -1) {
                totalCost += cost;
                // extra credit
                System.out.print("Enter the item: ");
                String item = scan.nextLine();
                items.add(item);
            }
        }
        // Calculations
        System.out.println("-------------------------------------------");
        double totalTip = totalCost * (tip / 100.0);
        System.out.println("Balance: $" + cash);
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + (Math.round(totalTip * 100.0) / 100.0));
        System.out.println("Total bill with tip: $" + (Math.round((totalTip + totalCost) * 100.0) / 100.0));
        System.out.println("Your change: $" + (Math.round((cash - (totalTip + totalCost)) * 100.0) / 100.0)); // Freestyle
        System.out.println("Per person cost before tip: $" + (Math.round((totalCost / group) * 100.0) / 100.0));
        System.out.println("Tip per person: $" + (Math.round((totalTip / group) * 100.0) / 100.0));
        System.out.println("Total cost per person: $" + (Math.round(((totalCost + totalTip) / group) * 100.0) / 100.0));
        System.out.println("-------------------------------------------");
        // extra credit
        System.out.println("Items ordered:");
        for (String oneItem : items) {
            System.out.println(oneItem);
        }
        scan.close();

        // I learned how to use list from https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
        // I learned how to round from https://stackoverflow.com/questions/8825209/rounding-decimal-points
    }
}
