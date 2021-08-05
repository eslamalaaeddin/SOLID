package S.principle_adherence;

public class Player {
    //public for simplicity
    public String name;
    public int score;

    public void shoot(){
        System.out.println("Shooting...");
    }

    public void pass(){
        System.out.println("Passing...");
    }

    public void tackle(){
        System.out.println("Tackling...");
    }

    public void score(){
        System.out.println("Scoring...");
    }
}
