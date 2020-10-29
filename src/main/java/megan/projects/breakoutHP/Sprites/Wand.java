package megan.projects.breakoutHP.Sprites;

public class Wand extends MagicObject {

    public Wand(){
        super("When it's your turn at Olivanders, maybe your core will be the same as Harry's...", "From the ashes.", "Wand");
    }


    @Override
    public String makeSound() {
        return "The wand chooses the wizard. " +
                "\nEveryone knows that. " +
                "\nYour swish and flick will get you far, " +
                "\nunless you're turned into a cat.";
    }

    @Override
    public String answer() {
        return "Phoenix";
    }

    @Override
    public String action() {
        return "Alohamora! You're unlocking the secrets of this room.";
    }
}
