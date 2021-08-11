import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println("");
            int c = a;
            for(int j = 0; j < n; j++){
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }
        }
        in.close();
    }
}