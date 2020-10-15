package megan.projects.breakoutHP.Player;

public class Player {

    private int keyCount = 0;
    private int easterEggCount = 0;
    private int lives = 5;


    //Lives logic
    public int getLives() {
        return lives;
    }

    public void loseALife(){
        lives --;
    }

    //Easter Egg Logic
    public int getEasterEggCount(){
        return easterEggCount;
    }

    //Key Logic
    public int getKeyCount(){
        return keyCount;
    }

    public void foundKey(){
        keyCount ++;
    }

}
