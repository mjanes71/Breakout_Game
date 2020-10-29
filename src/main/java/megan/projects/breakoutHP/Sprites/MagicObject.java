package megan.projects.breakoutHP.Sprites;

public abstract class MagicObject {

    private String riddle;
    private String hint;
    private String name;


    public MagicObject(String riddle, String hint,String name){
        this.riddle = riddle;
        this.hint = hint;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getRiddle(){
        return riddle;
    }

    public String getHint(){
        return hint;
    }

    public abstract String makeSound();

    public abstract String answer();

    public abstract String action();
}
