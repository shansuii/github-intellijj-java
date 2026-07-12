import java.util.Scanner;

public class bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            System.out.print("* ");
        }
        int nsp = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}