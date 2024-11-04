package forloop.practice.com;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        boolean val = true;
        Scanner num = new Scanner(System.in);

        while (val) {
            System.out.println("Enter a number for creating table:");
            int table = num.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " X " + table + " = " + i * table);
            }
            System.out.println("Select one option:");
            System.out.println("1. Continue to create table");
            System.out.println("2. Exit the process");
            System.out.println("Notes: just type 1 or 2 (no need to type the sentence)");
            int option = num.nextInt();

            if (option == 2) {
                val = false;
                System.out.println("Exiting...");
            }
        }

        num.close();
    }
}


