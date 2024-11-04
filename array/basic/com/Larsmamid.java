package array.basic.com;

import java.util.Scanner;
public class Larsmamid {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("How many items do you want to store in the array?");
        int num = val.nextInt();
        int[] hi = new int[num];
        int middle;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a value for index " + i + ": ");
            hi[i] = val.nextInt();

        }
        System.out.print("The array elements are: [");
        for (int i = 0; i < hi.length; i++) {
            System.out.print(hi[i]);
            if (i < hi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        middle=num/2;
        int midval=hi[middle];

        System.out.println("The middle element is: "+midval);

        val.close();
    }
}