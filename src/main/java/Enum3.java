enum Being {
    Human("Speaking"),
    Animal("Running"),
    Plants("Growing"),
    Plankton("Micro-particle");

    public String speciality;

    Being(String speciality) {
        this.speciality = speciality;
    }
}

public class Enum3 {
    public static void main(String[] args) {
        for (Being s: Being.values()){
            System.out.print(s.name() + ": ");
            System.out.println(s.speciality);
        }
    }
}
