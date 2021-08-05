package S.principle_adherence;

public class GameMonitor {

    public void printWinnerName(Player player){
        System.out.println("Winner is..." + player.name);
    }

    public void printScore(Player player){
        System.out.println("Score is..." + player.score);
    }

    public void printTopThreeNames(){
        System.out.println("Top three...");
    }
}
