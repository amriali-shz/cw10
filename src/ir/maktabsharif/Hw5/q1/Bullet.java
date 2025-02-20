package ir.maktabsharif.Hw5.q1;

public class Bullet {
    private int count;
    private int point;
    private Soldier soldier;

    public int getCount() {
        return count;
    }
    public void setCount (int count) {
        this.count = count;
    }
    public int getPoint () {
        return point;
    }
    public void setPoint (int point) {
        this.point = point;
    }
    public Soldier getSoldier () {
        return soldier;
    }
    public void setSoldier (Soldier soldier) {
        this.soldier = soldier;
    }
    public Bullet () {}
    public Bullet (int count ,int point, Soldier soldier) {
        this.count = count;
        this.point = point;
        this.soldier = soldier;
    }
    public String toString () {
        return "Bullet " + count + " : " +  "[" + point + "]\n";
    }
}
