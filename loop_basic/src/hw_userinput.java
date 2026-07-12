import java.util.Scanner;

public class hw_userinput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for(int i = 1;i<=n ;i++) {
            System.out.println(i);
            System.out.println( temp );
            temp--;
        }
    }
}
