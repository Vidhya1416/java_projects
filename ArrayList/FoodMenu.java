package ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodMenu {
    private HashMap<String, Integer> foodRates = new HashMap<>();
    private HashMap<String, Integer> foodCount = new HashMap<>();

    public void addFood(String food, int rate) {
        foodRates.put(food, rate);
        foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
    }

    public void displayMenu() {
        System.out.println("Current Food Menu:");
        for (Map.Entry<String, Integer> entry : foodRates.entrySet()) {
            String food = entry.getKey();
            int rate = entry.getValue();
            int count = foodCount.get(food);
            System.out.println("Food: " + food + ", Rate: " + rate + ", Available: " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodMenu menu = new FoodMenu();
        
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Add food");
            System.out.println("2. Display menu");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.println("Enter food name:");
                    String food = scanner.nextLine();
                    System.out.println("Enter rate:");
                    int rate = scanner.nextInt();
                    menu.addFood(food, rate);
                    System.out.println(food + " added with rate " + rate);
                    break;
                case 2:
                    menu.displayMenu();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
