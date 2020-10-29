package megan.projects.breakoutHP.Room;

import megan.projects.breakoutHP.Sprites.MagicObject;
import megan.projects.breakoutHP.Sprites.SortingHat;
import org.junit.Assert;
import org.junit.Test;

public class RoomTests {

    @Test
    public void object_info_formatting_correctly(){
        MagicObject myHat1 = new SortingHat();
        MagicObject myHat2 = new SortingHat();
        MagicObject myHat3 = new SortingHat();
        MagicObject myHat4 = new SortingHat();
        MagicObject myHat5 = new SortingHat();
        Room sut = new Room(myHat1, myHat2, myHat3, myHat4, myHat5);
        String result =sut.objectInfo(myHat1);
        System.out.println(result);
        System.out.println(sut.objectHint(myHat1));
    }
}
