package Scanner;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
        String[] game = { "Rock", "Paper", "Scissor" };
        System.out.println("Enter your move");
        String player = sc.next();
        Random random = new Random();
        int randomIndex = random.nextInt(game.length);
        String computer = game[randomIndex];
        System.out.format("Computer chose %s", computer);
        System.out.println();

        if (player.equalsIgnoreCase(computer)) {
            System.out.println("It is a draw");
        } else if ((player.equalsIgnoreCase("Rock")  && computer.equalsIgnoreCase("Scissor")) || (player.equalsIgnoreCase("Scissor") && computer.equalsIgnoreCase("Paper") ) || (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ) {
            System.out.println("---------you won----------");
        } else {
            System.out.println("---------computer won-----------");
        }
        System.out.println("Do you want to continue? Type yes or no");
    }while(sc.next().equalsIgnoreCase("yes"));
    sc.close();
    }
}
