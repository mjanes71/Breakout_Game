package megan.projects.breakoutHP.Sprites;

public class Broom extends MagicObject{

    public Broom(){
        super("Up and up and up we go. In broomstick games, it's what we throw.", "Quidditch chaser's best friend.", "Numbus 3000 Broomstick");
    }

    @Override
    public String makeSound() {
        return "As every school-age wizard knows, \n" +
                "the fact that we fly on broomsticks is probably \nour worst-kept secret. " +
                "\nNo muggle illustration of a witch is complete \nwithout a broom.";
    }

    @Override
    public String answer() {
        return "Quaffle";
    }

    @Override
    public String action() {
        return "You've caught the snitch! 100 points to Gryffindor!";
    }
}
