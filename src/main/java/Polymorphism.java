class Vehicle{
    public void moving(){
        System.out.println("It is controlled");
    }
}
class Car extends Vehicle{
    public void moving(){
        System.out.println("It is controlled more easily");
    }
}

class Polymorphism2 {
    public static void getObject(Vehicle object2) {
        object2.moving();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle c1 = new Car();
        getObject(v1);
        getObject(c1);
    }
}