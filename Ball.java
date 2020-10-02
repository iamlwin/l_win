package ahmedov.ru.mirea.lab1;

public class Ball {
    private String type;
    private int size;

    public Ball(String n, int a) {
        type = n;
        size = a;
    }
    public Ball(String n) {
        type = n;
        size = 0;
    }
    public Ball() {
        type =  "Ball";
        size = 0;
    }

    public void setSize(int age) {
        this.size = size;
    }
    public void setType(String name) {
        this.type = type;
    }
    public String getType(String name) {
        return type;
    }
    public int getSize() {
        return size;
    }
    public String toString() {
        return this.type+", size  "+this.size;
    }
    public void intoDecimeters() {
        System.out.println(type+" 's size in decimetres is "+size*10+" centimeters ");
    }
}
