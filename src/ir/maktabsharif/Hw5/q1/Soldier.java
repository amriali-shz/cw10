package ir.maktabsharif.Hw5.q1;
import java.util.Arrays;
public class Soldier {
    private Long id;
    private Bullet[] bullets;
    private int score;
    private Rank rank;
    private Rank initialRank;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Bullet[] getBullets() {
        return bullets;
    }
    public void setBullets(Bullet[] bullets) {
        this.bullets = bullets;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public Rank getRank() {
        return rank;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    public Rank getInitialRank() {
        return initialRank;
    }

    public void setInitialRank(Rank initialRank) {
        this.initialRank = initialRank;
    }
    public Soldier () {}
    public Soldier(Long id, Bullet[] count, Rank rank) {
        this.id = id;
        this.bullets = count;
        this.rank = rank;
    }
    public String toString () {
        return "Soldier ID : " + "[" +  id + "]\n" + Arrays.toString(bullets) + "\nFinal Score: " + score + "\nInitial Rank : " + initialRank + "\nFinal Rank: " + rank + "]\n*************************\n";
    }
}
