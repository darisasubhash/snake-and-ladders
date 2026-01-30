package service;

import constants.GameConstants;
import model.Player;
import util.Dice;

import java.util.Random;

public class Service {
    static Random random =new Random();
    private static final int WINNING_POSITION = 100;
    public void playerTurn(Player player){
        int value= Dice.roll();
        System.out.println("Dice rolled - value : "+value);
        int option = random.nextInt(3);
        String optionName = "";

        switch (option) {
            case GameConstants.NO_PLAY:
                optionName = "No Play";
                break;

            case GameConstants.LADDER:
                optionName = "Ladder";
                int ladval=player.getPosition() + value;
                if(ladval<=WINNING_POSITION){
                    player.setPosition(ladval);
                }
                break;

            case GameConstants.SNAKE:
                optionName = "Snake";
                int snakevalue=player.getPosition() - value;
                if(snakevalue<0){
                    player.setPosition(0);
                }
                else{
                    player.setPosition(snakevalue);
                }
                break;
        }

        System.out.println("Option: " + optionName);
        System.out.println("Player's new position : " + player.getPosition());
    }
    public boolean hasPlayerWon(Player player){
        return player.getPosition()==WINNING_POSITION;
    }
}
