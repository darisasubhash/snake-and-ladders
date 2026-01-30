package model;

public class Player {
    private int position;
    private int diceCount;

    public Player(){
        this.position=0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDiecCount() {
        return diceCount;
    }
    public void incrementDiceCont(){
        this.diceCount++;
    }
}
