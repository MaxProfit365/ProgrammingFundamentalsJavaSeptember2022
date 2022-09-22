package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String reversedWord = "";

        for (int start = word.length() - 1; start >= 0; start--) {
            char symbol = word.charAt(start);
            reversedWord += "" + symbol;
        }
        System.out.println(reversedWord);
    }
}
