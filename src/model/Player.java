package model;

public class Player {
    private int position;
    private int diceCount;
    private String name;

    public Player(String name){
        this.position=0;
        this.diceCount=0;
        this.name=name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
