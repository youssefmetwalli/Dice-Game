import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");

        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        int totalValue = dice1 + dice2;
        System.out.println("Total value: " + totalValue);

        if (totalValue > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }

        scanner.close();
    }
}
