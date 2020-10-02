package ahmedov.ru.mirea.lab1;

public class TestBall {
    public static void main(String [] args) {
        Ball b1 = new Ball("Football ball", 7);
        Ball b2 = new Ball("Basketball ball",  8);
        Ball b3 = new Ball("Volleyball ball", 6);
        b3.setSize(1);
        System.out.println(b1);
        b1.intoDecimeters();
        b2.intoDecimeters();
        b3.intoDecimeters();
    }
}
