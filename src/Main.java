import model.Player;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to Snake and Ladders Game..!");
        System.out.println("Enter Player 1 Name");
        Player player1=new Player(scan.nextLine());
        System.out.println("Enter Player 2 Name");
        Player player2=new Player(scan.nextLine());
        System.out.println("Player 1 initial position: " + player1.getPosition());
        System.out.println("Player 2 initial position: " + player2.getPosition());
        Service service=new Service();
        Player currentPlayer=player1;
        while(true){
            boolean playAgain = service.playerTurn(currentPlayer);

            if(service.hasPlayerWon(currentPlayer)){
                System.out.println("Congratulations " +currentPlayer.getName() + " you won the game...!");
                System.out.println("Total number of times dice rolled to win: " + currentPlayer.getDiecCount());
                break;
            }

            if (!playAgain) {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
}