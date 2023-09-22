import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator");
        System.out.print("How many people are in your group: ");
        int group = scan.nextInt();
        System.out.print("What's the tip percentage? (1-100): ");
        double cost = 0;
        double totalCost = 0;
        while (cost != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if (cost != -1) {
                totalCost += cost;
            }
        }
        System.out.print(totalCost);
        System.out.print(group);
    }
}
