package megan.projects.breakoutHP.Player;

public class Player {

    private static final int KEY_DEFAULT = 0;
    private static final int LIVES_DEFAULT = 5;

    private int keyCount;
    private int lives;


   public Player(){
       keyCount = KEY_DEFAULT;
       lives = LIVES_DEFAULT;
   }

    //Lives logic
    public String getLivesString() {
        return Integer.toString(lives);
    }

    public int getLivesInt(){
        return lives;
    }

    public void loseALife(){
        lives --;
    }

    public boolean outOfLives(){
        return lives == 0;
    }


    //Key Logic
    public String getKeyCountString(){
        return Integer.toString(keyCount);
    }

    public int getKeyCountInt(){
        return keyCount;
    }

    public void foundKey(){
        keyCount ++;
    }

}
