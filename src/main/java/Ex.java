import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i, min, max;
        n = sc.nextInt();
        max = 0;
        min = 30000;
        for (i = 1; i <= n; i++) {
            m = sc.nextInt();
            if (m < min) {
                min = m;
            }
            if (m > max) {
                max = m;
            }
        }
        if (n == 0 || i == 2) {
            System.out.println("Ooops!");
        } else {
            System.out.printf("%d %d", min, max);
        }
    }
}
