package megan.projects.breakoutHP.Sprites;


import megan.projects.breakoutHP.Sprites.MagicObject;

public class SortingHat extends MagicObject {

    public SortingHat(){
        super("Those who don me fear this choice, unless they speak with evil voice.", "Salazar's legacy.", "Sorting Hat");
    }

    @Override
    public String makeSound() {
        return "Now slip me snug around your ears,\n" +
                "I've never yet been wrong,\n" +
                "I'll have a look inside your mind\n" +
                "And tell where you belong!";
    }

    @Override
    public void easterEgg() {

    }

    @Override
    public String action() {
        return "For you I choose.......GRYFFINDOR! \n" +
                "You have received a 1 Key.";

    }
}
