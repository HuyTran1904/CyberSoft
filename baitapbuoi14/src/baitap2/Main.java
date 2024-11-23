package baitap2;

public class Main {
    public static void main (String[] agrs){
        Team team = new Team();
        Defender a1 = new Defender("LUKAKU",  30);
        Defender a2 = new Defender("VAN DIJK", 85);
        Defender a3 = new Defender("RAMOS", 88);
        Defender a4 = new Defender("CHIELLINI", 80);

        Forward a5 = new Forward("MESSI", 95);
        Forward a6 = new Forward("RONALDO", 93);
        Forward a7 = new Forward("MBAPPE", 92);

        Midfielder a8 = new Midfielder("DE BRUYNE", 90);
        Midfielder a9 = new Midfielder("MODRIC", 88);
        Midfielder a10 = new Midfielder("KROOS", 85);

        team.addPlayer(a1);
        team.addPlayer(a2);
        team.addPlayer(a3);
        team.addPlayer(a4);
        team.addPlayer(a5);
        team.addPlayer(a6);
        team.addPlayer(a7);
        team.addPlayer(a8);
        team.addPlayer(a9);
        team.addPlayer(a10);

        team.display_team();
        System.out.println("Total Skill Level of the Team: " + team.total_skill_level());
    }
}
