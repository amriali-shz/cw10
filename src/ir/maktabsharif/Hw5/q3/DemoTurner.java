package ir.maktabsharif.Hw5.q3;

public class DemoTurner {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner clock = new Clock();
        Turner wheel = new Wheel();
        leaf.turn();
        page.turn();
        pancake.turn();
        clock.turn();
        wheel.turn();
    }
}
