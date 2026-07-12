import javax.swing.*;
import java.util.Scanner;

public class mag_small_than69_ornot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0 && (x*-1)<69 ) {
            System.out.println("mag is smaller");
        }else System.out.println("larger magnitude" +
                "");


    }
}
//magnitude is modulus.