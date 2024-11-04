package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ticketbooking {

    private HashMap<String, Integer> foodMenu = new HashMap<>();
    private HashMap<String, Integer> foodCount = new HashMap<>();

    public void initializeFoodMenu() {
        foodMenu.put("Pizza", 250);
        foodMenu.put("Burger", 150);
        foodMenu.put("Pasta", 200);
        foodMenu.put("Sandwich", 100);
        foodMenu.put("Fries", 80);
        foodCount.put("Pizza", 10);  
        foodCount.put("Burger", 10);
        foodCount.put("Pasta", 10);
        foodCount.put("Sandwich", 10);
        foodCount.put("Fries", 10);
    }

    public void user() {
        boolean val = true;
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);

        Scanner inp = new Scanner(System.in);

        while (val) {
            System.out.println("Select an option:");
            System.out.println("1. Book a seat");
            System.out.println("2. Display food menu and order");
            System.out.println("3. Exit");
            int option = inp.nextInt();
            inp.nextLine();  

            switch (option) {
                case 1:
                    System.out.println("Welcome to Seat booking platform!");
                    System.out.println("Kindly enter your phone number: ");
                    long num = inp.nextLong();
                    System.out.println("Seats: " + alist);
                    System.out.println("Kindly enter your seat number: ");
                    int seatnum = inp.nextInt();
                    if (alist.contains(seatnum)) {
                        alist.remove(Integer.valueOf(seatnum));
                        System.out.println("Seat " + seatnum + " has been booked.");
                        System.out.println("Seats remaining: " + alist);
                    } else {
                        System.out.println("Seat " + seatnum + " is not available.");
                    }
                    break;
                case 2:
                    food(inp);
                    break;
                case 3:
                    val = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        inp.close();
    }

    public void food(Scanner inp) {
        boolean ordering = true;
        int totalAmount = 0;
        ArrayList<String> orderedFoods = new ArrayList<>();

        while (ordering) {
            System.out.println("Food Menu:");
            
            for (Map.Entry<String, Integer> entry : foodMenu.entrySet()) 
            {
                String food = entry.getKey();
                int rate = entry.getValue();
                int available = foodCount.getOrDefault(food, 0);
                System.out.println(food + ": Rs. " + rate + " (Available: " + available + ")");
            }

            System.out.println("Enter the food you want to order (or type 'exit' to finish):");
            
            String food = inp.nextLine();
            
            if (food.equalsIgnoreCase("exit"))
            {
                ordering = false;
                
            } 
            else if (foodMenu.containsKey(food) && foodCount.getOrDefault(food, 0) > 0)
            {
                System.out.println("Enter quantity:");
                int quantity = inp.nextInt();
                inp.nextLine();  
                int available = foodCount.getOrDefault(food, 0);
                
                if (quantity <= available) {
                    int rate = foodMenu.get(food);
                    
                    totalAmount += rate * quantity;
                    
                    foodCount.put(food, available - quantity);
                    
                    orderedFoods.add(food + " x " + quantity + " (Rate: " + rate + " each)");
                    
                    System.out.println(quantity + " x " + food + " added to your order. Rate: Rs. " + rate + " each");
                }
                
                else {
                    System.out.println("Sorry, only " + available + " " + food + " available.");
                }
            }
            else {
                System.out.println("Sorry, " + food + " is not available.");
            }
        }

        System.out.println("Your order summary:");
        
        for (String orderedFood : orderedFoods)
        {
            System.out.println(orderedFood);
        }
        System.out.println("Total Amount: Rs. " + totalAmount);
    }

    public static void main(String[] args)
    {
        Ticketbooking arraypro = new Ticketbooking();
        arraypro.initializeFoodMenu();
        arraypro.user();-
    }
}
