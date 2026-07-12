import java.util.Scanner;

public class printsame_orpositivenum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        if(x >= 0) System.out.println(x);
        else System.out.println(x*-1);
        //or we can write (-x) instead of x*-1.
    }
}
