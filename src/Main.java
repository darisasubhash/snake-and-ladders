import model.Player;
import service.Service;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladders Game..!");
        Player player=new Player();
        System.out.println("Starting Position : "+player.getPosition());
        Service service=new Service();
        service.playerTurn(player);
    }
}