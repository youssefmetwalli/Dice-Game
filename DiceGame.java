import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Rolling dice...");
        
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total value: " + (dice1 + dice2));
    }
}
