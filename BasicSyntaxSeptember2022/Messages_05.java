package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            int givenNumber = Integer.parseInt(scan.nextLine());
            int mainDigit = givenNumber % 10;
            int offsetNumber = (mainDigit - 2) * 3;

            if (mainDigit >= 8) {
                offsetNumber += 1;
            }
            if (mainDigit == 0) {
                System.out.print(" ");
                continue;
            }
            String letterText = "" + givenNumber;
            int indexLetter = offsetNumber + letterText.length() - 1;
            char firstIndex = 'a';

            int totalIndex = indexLetter + firstIndex;
            System.out.print((char) totalIndex);

        }
    }
}
