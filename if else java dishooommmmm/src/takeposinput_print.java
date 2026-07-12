import java.util.Scanner;

public class takeposinput_print {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 3 == 0 && x % 5 ==0) System.out.println("div by both");
        else if (x%3 == 0) System.out.println("div by 3");
        else if (x%5==0  ) {
            System.out.println("div by both 3 and 5");
        }

        else {
            System.out.println("not div by both");


        }
    }
}
