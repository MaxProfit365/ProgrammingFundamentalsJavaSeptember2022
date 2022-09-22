package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            if (secondNumber >= thirdNumber) {
                System.out.println(firstNumber);
                System.out.println(secondNumber);
                System.out.println(thirdNumber);
            } else {
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
                System.out.println(secondNumber);
            }
        }
        if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            if (firstNumber >= thirdNumber) {
                System.out.println(secondNumber);
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
            } else {
                System.out.println(secondNumber);
                System.out.println(thirdNumber);
                System.out.println(firstNumber);
            }
        }
        if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            if (firstNumber >= secondNumber) {
                System.out.println(thirdNumber);
                System.out.println(firstNumber);
                System.out.println(secondNumber);
            } else {
                System.out.println(thirdNumber);
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }
        }
    }
}
