import java.util.*;
enum Car1 {
    BMW, AUDI, Mercedes;
    public int hp;
}

class Enum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car1.BMW.hp = sc.nextInt();
        Car1.AUDI.hp = sc.nextInt();
        Car1.Mercedes.hp = sc.nextInt();
        System.out.println(Car1.BMW.hp);
        System.out.println(Car1.AUDI.hp);
        System.out.println(Car1.Mercedes.hp);
    }
}
