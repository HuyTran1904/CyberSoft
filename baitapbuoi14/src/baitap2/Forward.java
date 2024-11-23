package baitap2;

public class Forward extends Player {
    public Forward (String name, int skill_level){
        super(name, "Foward", skill_level);
    }

    @Override
    public void play() {
        System.out.println(getName() + "Pressing toàn sân ");
    }

    public String toString() {
        return "Name: " + getName() + ", Position: " + getPosition() + ", Skill Level: " + getSkill_level();
    }
}
