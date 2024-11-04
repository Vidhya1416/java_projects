package basic.learning.com;

import java.util.Scanner;

public class sentenreverse {
    public static void main(String[] args) {
        sentenreverse obj = new sentenreverse();
        obj.reverser();
    }

    public void reverser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str1 = scanner.nextLine();
        
        String[] words = str1.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            reversedSentence.append(revWord.reverse().toString()).append(" ");
        }

        System.out.println("Reversed string: " + reversedSentence.toString().trim());
        scanner.close();
    }
}
