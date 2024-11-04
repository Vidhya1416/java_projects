package array.basic.com;

import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("How many items do you want to store in the array?");
        int num = val.nextInt();
        int[] hi = new int[num];
        int sum=0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a value for index " + i + ": ");
            hi[i] = val.nextInt();
            sum+=hi[i];
        }
        System.out.print("The array elements are: [");
        for (int i = 0; i < hi.length; i++) {
            System.out.print(hi[i]);
            if (i < hi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("The sum of array is:"+sum);
        val.close();
    }
}
