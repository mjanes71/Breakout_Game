package megan.projects.breakoutHP.Room;

import megan.projects.breakoutHP.Sprites.MagicObject;

public class Room {

    private MagicObject object1;
    private MagicObject object2;
    private MagicObject object3;
    private MagicObject object4;
    private MagicObject object5;

    public Room(MagicObject object1, MagicObject object2, MagicObject object3, MagicObject object4, MagicObject object5){
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.object4 = object4;
        this.object5 = object5;
    }

    public String returnObjectInfo(String objectName){
        return "You have found the " +
    }


}
