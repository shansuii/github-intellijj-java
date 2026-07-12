package fourdigitno;

import java.util.Scanner;

public class _ornot {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number");
        int x = sc.nextInt();
        if (x>999 && x<10000) System.out.println("four digit number");
        else System.out.println("not a four digit number");
    }
}
