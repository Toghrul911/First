import java.util.Scanner;

enum Cars{
    BMW(625), AUDI(560), Mercedes(600);
    public int hp;

    Cars(int hp) {
        this.hp = hp;
    }
}
enum Car2{
    BMW("Black"), AUDI("Blue");
    public String color;
    Car2(String color){
        this.color = color;
    }
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(Cars.BMW.hp);
        System.out.println(Car2.AUDI.color);
        System.out.println(Cars.Mercedes.hp);
    }
}
