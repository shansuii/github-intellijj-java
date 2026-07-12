import java.util.Scanner;

public class even_odd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x:");
        double x = sc.nextDouble();
        if (x % 2 == 0) {
            System.out.println("it is even number");
            System.out.println("i hate java");
        } else {
            System.out.println("it is odd");
            System.out.println("i love java");
        }
    }
}
