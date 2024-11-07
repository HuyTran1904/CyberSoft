public class Game {
    String gameName;
    int numPlays;

    public Game (String gameName){
        this.gameName = gameName;
        this.numPlays = 1;
    }

    public void gameStart(){
        System.out.println("Trò chơi " + gameName + " đã bắt đầu!");
    }

    public void gameEnd(){
        System.out.println("Trò chơi " + gameName + " đã kết thúc!");
        System.out.println("Tổng số lượt chơi: " + numPlays);
    }

    public void printGame(){
        System.out.println("--THÔNG TIN TRÒ CHƠI--");
        System.out.println("Tên trò chơi: " + gameName);
        gameStart();
        gameEnd();
    }
}
