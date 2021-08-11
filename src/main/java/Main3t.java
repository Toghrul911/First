import java.util.Scanner;
class Main3t {
    public static void main(String args[]) {
        int n, i, j, cnt = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for ( i = 1 ; i <= n ; i++ ) {
            for ( j = 1 ; j <= i ; j++ ) {
                System.out.print(cnt++ + " ");
            }
            System.out.println(" ");
        }
    }
}