import java.util.Scanner;
//check if the given number is composite or not ..!!!!!
public class composite_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0)


            {
                System.out.println("composite");
                break;
            }


        }
    }
}