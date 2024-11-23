package baitap2;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Player> playerList;

    public Team() {
        this.playerList = new ArrayList<>();
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void display_team(){
        System.out.println("---Danh sách cầu thủ---");
        System.out.println("\nDefenders:");
        for (Player player : playerList) {
            if (player.getPosition().equalsIgnoreCase("Defender")) {
                System.out.println(player);
            }
        }

        System.out.println("\nMidfielders:");
        for (Player player : playerList) {
            if (player.getPosition().equalsIgnoreCase("Midfielder")) {
                System.out.println(player);
            }
        }

        System.out.println("\nForwards:");
        for (Player player : playerList) {
            if (player.getPosition().equalsIgnoreCase("Forward")) {
                System.out.println(player);
            }
        }
    }

    public int total_skill_level(){
        int total = 0;
        for (Player players : playerList) {
            total += players.getSkill_level();
        }
        return total;
    }
}
