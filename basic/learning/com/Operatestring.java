package basic.learning.com;

//public class Operatestring {
//    public static void main(String[] args) {
//        String str1 = "Hello";
//        Operatestring obj = new Operatestring();
//        obj.stringspliter(str1);
//    }
//
//    public void stringspliter(String str) {
//        
//        char[] carr = str.toCharArray();
//        
//        String rev = "";
//        for (int i = carr.length - 1; i >= 0; i--) {
//            rev += carr[i];
//        }
//
//       
//        System.out.println("Reversed string: " + rev);
//    }
//}
//
//    
//public class Operatestring {
//    public static void main(String[] args) {
//        String sen = "hi vidhya";
//        System.out.println(sentencerev(sen));
//    }
//
//    static String sentencerev(String str) {
//        String rev = "";
//        String[] sarr = str.split(" ");
//        
//        for (String word : sarr) {
//            StringBuilder revWord = new StringBuilder(word);
//            rev += revWord.reverse().toString() + " ";
//        }
//        
//        return rev.trim();
//    }
//}
//import java.util.Scanner;
//
//public class Operatestring {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//        String str1 = inp.nextLine();
//        System.out.println("Enter a character: ");
//        char str2 = inp.next().charAt(0);
//        
//        Operatestring s1 = new Operatestring();  
//        s1.check(str1, str2);
//        
//        inp.close();
//    }
//
//    public void check(String str1, char str2) {
//        char[] carr = str1.toCharArray();
//        int count = 0;
//        
//        for (int i = 0; i < carr.length; i++) {
//            if (carr[i] == str2) {  
//                count++;
//            }
//        }
//        
//        System.out.println("The character '" + str2 + "' appears " + count + " times.");
//    }
//	
//}
import java.util.Scanner;

public class Operatestring {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str1 = inp.nextLine();

        Operatestring s1 = new Operatestring();
        s1.check(str1);

        inp.close();
    }

    public void check(String str1) {
        char[] carr = str1.toCharArray();
        char[] sarr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int v_count = 0;
        int c_count = 0;

        for (int i = 0; i < carr.length; i++) {
            boolean isVowel = false;

            for (char vowel : sarr) {
                if (carr[i] == vowel) {
                    v_count++;
                    isVowel = true;
                    break;
                }
            }

            if (!isVowel && Character.isLetter(carr[i])) {
                c_count++;
            }
        }

        System.out.println("The vowels appear " + v_count + " times.");
        System.out.println("The consonants appear " + c_count + " times.");
    }

            }
        //type conversion //anagram
        //type:
        //narrowing large to small
		//widening 

//return new int[]{v1,v2}
                             