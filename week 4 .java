import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. What do you do?");
        System.out.println("1. Go deeper into the forest");
        System.out.println("2. Look for a way out");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You venture deeper into the forest and encounter a wild animal!");
                System.out.println("What do you do?");
                System.out.println("1. Try to fight the animal");
                System.out.println("2. Run away");

                int choice2 = scanner.nextInt();

                if (choice2 == 1) {
                    System.out.println("You bravely fight the animal but get injured. Game over!");
                } else if (choice2 == 2) {
                    System.out.println("You manage to escape from the animal and find a path leading out of the forest. You win!");
                } else {
                    System.out.println("Invalid choice. Please choose again.");
                }
                break;

            case 2:
                System.out.println("You search for a way out and stumble upon an old map!");
                System.out.println("It shows two possible paths. Which one do you take?");
                System.out.println("1. Path through the mountains");
                System.out.println("2. Path through the swamp");

                int choice3 = scanner.nextInt();

                if (choice3 == 1) {
                    System.out.println("You take the path through the mountains and successfully find your way out. You win!");
                } else if (choice3 == 2) {
                    System.out.println("You take the path through the swamp but get lost. Game over!");
                } else {
                    System.out.println("Invalid choice. Please choose again.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
        }

        scanner.close();
    }
}
