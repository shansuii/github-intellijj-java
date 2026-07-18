import java.util.Scanner;

public class max_of_four {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
