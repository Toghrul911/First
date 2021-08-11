import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        if(first <= second && second <= third){
            System.out.println("Increasing order");
        }else if(first >= second && second >= third){
            System.out.println("Decreasing order");
        }else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
