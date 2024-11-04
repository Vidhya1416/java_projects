package basic.learning.com;

import java.util.Scanner;

public class Gradefinder {
    String passorfail(int num1, Scanner val) {
        boolean w1 = true;
        String value = "";
        while (w1) {
            value = num1 > 35 ? "Pass" : "Fail";
            System.out.println(value);

            System.out.println("Are you continue the process (Y/N)?");
            char v1 = val.next().charAt(0);
            if (v1 == 'N' || v1 == 'n') {
                w1 = false;
                System.out.println("Exiting...");
            } else {
                System.out.println("Enter a mark:");
                num1 = val.nextInt();
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a mark:");
        int num = val.nextInt();
        Gradefinder ob1 = new Gradefinder();
        ob1.passorfail(num, val);
        val.close();
    }
}
