package util;

import java.util.Random;

public class Dice {
    static Random rd=new Random();
    public static int roll(){
       return rd.nextInt(6)+1;
    }
}
