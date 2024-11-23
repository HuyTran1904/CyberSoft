package baitap2;

public class Defender extends Player {
    public Defender (String name, int skill_level){
        super(name, "Defender", skill_level);
    }

    @Override
    public void play() {
        System.out.println(getName() + "Phòng ngự chặt chẽ ");
    }

    public String toString() {
        return "Name: " + getName() + ", Position: " + getPosition() + ", Skill Level: " + getSkill_level();
    }
}
