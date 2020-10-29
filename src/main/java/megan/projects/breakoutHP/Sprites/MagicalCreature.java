package megan.projects.breakoutHP.Sprites;

public class MagicalCreature extends MagicObject {

    public MagicalCreature(){
        super("Never peer into the eyes of the Basalisk. \nLucky for you, this creature's root is the cure.", "Our hearing may never be the same.", "Magical Creature");
    }

    @Override
    public String makeSound() {
        return "Gardening isn't always a sinch. " +
                "\nIn the wizarding world, some things pinch! " +
                "\nOthers might bite, or ooze, or explode, " +
                "\nBe sure to wear gloves, you're safety here is not owed.";
    }

    @Override
    public String answer() {
        return "Mandrake";
    }

    @Override
    public String action() {
        return "You saved Ginny Weasley!";
    }
}
