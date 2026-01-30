package service;

import constants.GameConstants;
import model.Player;
import util.Dice;

import java.util.Random;

public class Service {
    static Random random =new Random();
    private static final int WINNING_POSITION = 100;
    public boolean playerTurn(Player player){
        int value= Dice.roll();
        player.incrementDiceCont();
        System.out.println("Dice rolled: " + value + " (Roll #" + player.getDiecCount()+ ")");

        System.out.println("Dice rolled - value : "+value);
        int option = random.nextInt(3);
        String optionName = "";

        switch (option) {
            case GameConstants.NO_PLAY:
                optionName = "No Play";
                System.out.println(optionName);
                return false;

            case GameConstants.LADDER:
                optionName = "Ladder";
                int ladval=player.getPosition() + value;
                if(ladval<=WINNING_POSITION){
                    player.setPosition(ladval);
                }
                System.out.println(optionName);
                return true;

            case GameConstants.SNAKE:
                optionName = "Snake";
                int snakevalue=player.getPosition() - value;
                if(snakevalue<0){
                    player.setPosition(0);
                }
                else{
                    player.setPosition(snakevalue);
                }
                System.out.println(optionName);
                return false;
        }
        return false;
    }
    public boolean hasPlayerWon(Player player){
        return player.getPosition()==WINNING_POSITION;
    }
}
