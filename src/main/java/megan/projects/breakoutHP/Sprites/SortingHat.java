package megan.projects.breakoutHP.Sprites;


import megan.projects.breakoutHP.Sprites.MagicObject;

public class SortingHat extends MagicObject {

    public SortingHat(){
        super("Those who don me fear this choice, unless they speak with evil voice.", "Salazar's legacy.", "Sorting Hat");
    }

    @Override
    public String makeSound() {
        return "Now slip me snug around your ears,\nI've never yet been wrong,\nI'll have a look inside your mind\nAnd tell where you belong!";
    }


    @Override
    public String action() {
        return "For you I choose.......GRYFFINDOR! \n" +
                "You have received a 1 Key.";

    }

    @Override
    public String answer() {
        return "Slytherin";
    }
}
