package BasicSyntaxMoreExercises;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scan.nextLine());
        String game = scan.nextLine();
        double money = currentBalance;
        boolean isTrue = true;

        while (!game.equals("Game Time")) {

            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    currentBalance -= 39.99;
                    if (currentBalance < 0) {
                        currentBalance += 39.99;
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "CS: OG":
                    currentBalance -= 15.99;
                    if (currentBalance < 0) {
                        currentBalance += 15.99;
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Zplinter Zell":
                    currentBalance -= 19.99;
                    if (currentBalance < 0) {
                        currentBalance += 19.99;
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Honored 2":
                    currentBalance -= 59.99;
                    if (currentBalance < 0) {
                        currentBalance += 59.99;
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch":
                    currentBalance -= 29.99;
                    if (currentBalance < 0) {
                        currentBalance += 29.99;
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                isTrue = false;
                break;
            }
            game = scan.nextLine();
        }
        if (isTrue) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", money - currentBalance, currentBalance);
        }
    }
}
