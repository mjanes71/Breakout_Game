package megan.projects.breakoutHP.Sprites;

public abstract class MagicObject {

    private String riddle;
    private String hint;
    private String name;


    public MagicObject(String riddle, String hint,String name){
        this.riddle = riddle;
        this.hint = hint;
    }

    public String getRiddle(){
        return riddle;
    }

    public String getHint(){
        return hint;
    }

    public abstract String makeSound();

    public abstract void easterEgg(); // abstract so subclasses have to implement it, no body b/c abstract

    public abstract String action();
}
