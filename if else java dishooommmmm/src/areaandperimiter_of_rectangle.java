import java.util.Scanner;

public class areaandperimiter_of_rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int l = sc.nextInt();
        System.out.println("enter width");
        int w = sc.nextInt();
        int P = 2*(l+w);
        int a = l*w;
        if (a>P) System.out.println("area is greater ");
        else System.out.println("p is greatr");


    }
}
