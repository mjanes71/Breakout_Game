package megan.projects.breakoutHP.Player;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTests {

    @Test
    public void found_key_adds_key(){
        Player sut = new Player();
        sut.foundKey();
        int result = sut.getKeyCount();
        Assert.assertEquals(1, result);
    }

    @Test
    public void multiple_found_key_adds_key(){
        Player sut = new Player();
        sut.foundKey();
        sut.foundKey();
        sut.foundKey();
        int result = sut.getKeyCount();
        Assert.assertEquals(3, result);
    }

    @Test
    public void loseALife_decreases_lives_by_one(){
        Player sut = new Player();
        sut.loseALife();
        int result = sut.getLives();
        Assert.assertEquals(4, result);
    }

    @Test
    public void multiple_loseALife_calls_(){
        Player sut = new Player();
        sut.loseALife();
        sut.loseALife();
        sut.loseALife();
        int result = sut.getLives();
        Assert.assertEquals(2, result);
    }

}
