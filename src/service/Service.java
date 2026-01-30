package service;

import model.Player;
import util.Dice;

public class Service {
    public void playerTurn(Player player){
        int value= Dice.roll();
        System.out.println("Dice rolled - value : "+value);
        player.setPosition(player.getPosition()+value);
        System.out.println("Player's New position is : "+player.getPosition());
    }
}
