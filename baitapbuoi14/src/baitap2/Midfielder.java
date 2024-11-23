package baitap2;

public class Midfielder extends Player {
    public Midfielder (String name, int skill_level){
        super(name, "Midfielder", skill_level);
    }

    @Override
    public void play() {
        System.out.println(getName() + "Làm bóng cho tiền đạo ");
    }

    public String toString() {
        return "Name: " + getName() + ", Position: " + getPosition() + ", Skill Level: " + getSkill_level();
    }
}
