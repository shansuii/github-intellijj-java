import java.util.Scanner;

public class rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= col; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}