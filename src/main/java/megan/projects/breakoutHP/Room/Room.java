package megan.projects.breakoutHP.Room;

import megan.projects.breakoutHP.Player.Player;
import megan.projects.breakoutHP.Sprites.MagicObject;

public class Room {

    private MagicObject object1;
    private MagicObject object2;
    private MagicObject object3;
    private MagicObject object4;
    private MagicObject object5;
    private Player player1 = new Player();

    public Room(MagicObject object1, MagicObject object2, MagicObject object3, MagicObject object4, MagicObject object5){
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.object4 = object4;
        this.object5 = object5;
    }

    //omnipotent room - gives information as player progresses and explores

    public String objectInfo(MagicObject objectName){
        return "\"" + objectName.makeSound() + "\"\n" +  "\nYou have found the " + objectName.getName() +
                "! Can you solve its riddle? \n" + "\n**************Riddle************\n\n" +  objectName.getRiddle();
    }

    public String objectHint(MagicObject objectName){
        return "\n\n**************Hint************\n\n" + objectName.getHint() + "\n\nDo you have another guess?";
    }

    public boolean riddleSolved(String response, MagicObject objectName){
        return response.equalsIgnoreCase(objectName.answer());
    }

    public String getObjectAction(MagicObject magicObject){
        return magicObject.action();
    }


    public MagicObject getObject1() {
        return object1;
    }

    public MagicObject getObject2() {
        return object2;
    }

    public MagicObject getObject3() {
        return object3;
    }

    public MagicObject getObject4() {
        return object4;
    }

    public MagicObject getObject5() {
        return object5;
    }

    public Player getPlayer1() {
        return player1;
    }
}
