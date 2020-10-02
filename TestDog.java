package ahmedov.ru.mirea.lab1;

public class TestDog {
    public static void main(String [] args) {
        Dog d1 = new Dog("Henkey", 1);
        Dog d2 = new Dog("Melony",  4);
        Dog d3 = new Dog("Axel", 11);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
