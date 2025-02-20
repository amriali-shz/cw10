package ir.maktabsharif.Hw5.q2;

public class Application {
    public static void main(String[] args) {
        char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
        char[] chars2 = {' ', 'w', 'o', 'r', 'l', 'd'};
        Sequence words1 = new Sequence();
        words1.setValue(chars1);
        Sequence words2 = new Sequence();
        words2.setValue(chars2);
        int indexOfE = words1.indexOf('e');
        System.out.println("Index of 'e': " + indexOfE);
        words1.concat(words2);
        System.out.println(words1.getValue());
        Sequence words3 = new Sequence();
        words3.setValue(chars2);
        System.out.println(words1.equals(words2));
        System.out.println(words3.equals(words2));
    }
}

