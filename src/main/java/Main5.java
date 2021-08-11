import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        int i = 3, j, n, y, x;
        System.out.print ("Enter number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        y = n + 5;
        //for(i = 1; i <= n; i++) {
            for(j = y; j > 0; j--) {
                System.out.print(" ");
            }
            //y--;
            for(x = 1; x <= i; x++) {
                System.out.print(i + " ");
            }
            System.out.println();
        //}
    }
}
