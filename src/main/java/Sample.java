class Beings{
    public void moving(){
        System.out.println("I can breeze!");
    }
}

class Human extends Beings{
    public void moving(){
        System.out.println("I can run!");
    }
}
class Polymorphism {
    public static void getObject(Beings object){
        object.moving();
    }
    public static void main(String[] args) {
        Beings b = new Beings();
        Human h = new Human();
        Polymorphism.getObject(b);
        Polymorphism.getObject(h);
    }
}
