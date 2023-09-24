import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group: ");
        int group = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        double cost = 0.0;
        double totalCost = 0.0;
        ArrayList<String> items = new ArrayList<String>();
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();

            if (cost != -1) {
                totalCost += cost;
                System.out.print("Enter the item: ");
                String item = scan.nextLine();
                items.add(item);
            }
        }
        System.out.println("-------------------------------------------");
        double totalTip = totalCost * (tip / 100.0);
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + (Math.round(totalTip * 100.0) / 100.0));
        System.out.println("Total bill with tip: $" + (Math.round((totalTip + totalCost) * 100.0) / 100.0));
        System.out.println("Per person cost before tip: $" + (Math.round((totalCost / group) * 100.0) / 100.0));
        System.out.println("Tip per person: $" + (Math.round((totalTip / group) * 100.0) / 100.0));
        System.out.println("Total cost per person: $" + (Math.round(((totalCost + totalTip) / group) * 100.0) / 100.0));
        System.out.println("-------------------------------------------");
        System.out.println("Items ordered:");
        for (String oneItem : items) {
            System.out.println(oneItem);
        }
        scan.close();
    }
}
