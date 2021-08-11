public class Exam2 {
    public static void main(String[] args) {
        int s = 5;
        for (int i = 3; i-- < 10; i+= 3){
            s += i++;
        }
        System.out.println(s);
    }
}
