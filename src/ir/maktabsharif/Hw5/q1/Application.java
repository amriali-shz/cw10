package ir.maktabsharif.Hw5.q1;
import static ir.maktabsharif.Hw5.q1.ShootingTest.*;

public class Application {
    public static void main(String[] args) {
        Soldier[] soldiers = setRandomSoldiers(15);
        repeatUntilTarget(soldiers, 60);
    }
}
