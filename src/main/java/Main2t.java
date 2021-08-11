import java.util.*;
public class Main2t {
    public static void main(String[] args) {
        int i, j, n, y, x;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        y = n;
        for(i = 1; i <= n; i++) {
            for(j = y; j != 0; j--) {
                System.out.print(" ");
            }
            for(x = 1; x <= i; x++) {
                System.out.print(i + " ");
            }
            System.out.println();
            y--;
        }
    }
}
