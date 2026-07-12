import java.util.Scanner;

public class sumofdigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

int y=0;
if (n <0) n = -n;
        while (n !=0) {

            y += (n % 10);
            n = (n / 10);

        }
        System.out.println(y);
    }
}
