package homework18;

import java.util.Scanner;

public class StrBuf {
    public static void main(String[] args) {
        String word = "I Like Java";
        StringBuffer str = new StringBuffer(word);
        str.deleteCharAt(1);
        str.deleteCharAt(5);
        System.out.println(str);

        String word1 = "I Like Java";
        StringBuffer str1 = new StringBuffer(word1);
        str1.insert(2,  "really ");
        System.out.println(str1);


        System.out.print("Введіть рядок: ");
        Scanner scanner = new Scanner(System.in);
        String word2 = scanner.nextLine();
        StringBuffer str2 = new StringBuffer(word2);
        int length = str2.length();
        System.out.println("Кількість символів у рядку: " + length);
        scanner.close();

        String word3 = "I Like Java";
        StringBuffer str3 = new StringBuffer(word3);
        str3.delete(0, 2);
        System.out.println(str3);

        String word4 = "I Like Java";
        StringBuffer str4 = new StringBuffer(word4);
        String finalword = str4.substring(7);
        System.out.println(finalword);

        String word5 = "I Like Java";
        StringBuffer str5 = new StringBuffer(word5);
        str5 = new StringBuffer(str5.toString().toUpperCase());
        System.out.println(str5);

        String word6 = "I Like Java";
        StringBuffer str6 = new StringBuffer(word6);
        str6 = new StringBuffer(str6.toString().toLowerCase());
        System.out.println(str6);
    }
}
