package baitap2;

public abstract class Player {
    private String name;
    private String position;
    private int skill_level;

    public Player(String name, String position, int skill_level){
        this.name = name;
        this.position = position;
        this.skill_level = skill_level;
    }

    public int getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(int skill_level) {
        this.skill_level = skill_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract void play();

    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Skill Level: " + skill_level;
    }
}
