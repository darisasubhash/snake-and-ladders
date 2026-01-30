package service;

import constants.GameConstants;
import model.Player;
import util.Dice;

import java.util.Random;

public class Service {
    static Random random =new Random();
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
                player.setPosition(player.getPosition() + value);
                break;

            case GameConstants.SNAKE:
                optionName = "Snake";
                player.setPosition(player.getPosition() - value);
                break;
        }

        System.out.println("Option: " + optionName);
        System.out.println("Player's new position : " + player.getPosition());
    }
}
