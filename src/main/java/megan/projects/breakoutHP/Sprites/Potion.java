package megan.projects.breakoutHP.Sprites;

public class Potion extends MagicObject {

    public Potion(){
        super("Whether I'm brewed in a bathroom or kept in a flask, I can help you accomplish many a task.", "Hermione's first difficult brew.", "Potion");
    }

    @Override
    public String makeSound() {
        return "There will be no foolish wand-waving " +
                "\nor silly incantations in this class. " +
                "\nAs such, I don't expect you to appreciate " +
                "\nthe subtle science and exact art that is potion-making.";
    }

    @Override
    public String answer() {
        return "Polyjuice";
    }

    @Override
    public String action() {
        return "You've mastered the exacting art of potion making!";
    }
}
