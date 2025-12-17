import java.util.Scanner;

public class RockPaperScissors {

    static boolean isValid(String choice) {
        return (choice.equals("rock") ||
                choice.equals("paper") ||
                choice.equals("scissors"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Player 1 input
        System.out.print("Player 1 :-");
        String p1 = sc.nextLine().toLowerCase();

        // Player 2 input
        System.out.print("Player 2 :-");
        String p2 = sc.nextLine().toLowerCase();

        if (!isValid(p1) || !isValid(p2)) {
            System.out.println("Invalid input! Please enter rock, paper, or scissors.");
        }

        // Draw condition
        else if (p1.equals(p2)) {
            System.out.println("It's a draw!");
        }

        else if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("paper") && p2.equals("rock")) ||
                (p1.equals("scissors") && p2.equals("paper"))) {
            System.out.println("Player 1 wins!");
        }

        else {
            System.out.println("Player 2 wins!");
        }

    }

}
