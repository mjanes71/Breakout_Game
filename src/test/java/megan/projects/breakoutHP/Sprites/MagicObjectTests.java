package megan.projects.breakoutHP.Sprites;

import org.junit.Assert;
import org.junit.Test;

public class MagicObjectTests {



    @Test
    public void hat_makes_sound() {
        SortingHat sut = new SortingHat();
        String result = sut.makeSound();
        Assert.assertEquals("Now slip me snug around your ears,\n" +
                "I've never yet been wrong,\n" +
                "I'll have a look inside your mind\n" +
                "And tell where you belong!", result);

    }

}
