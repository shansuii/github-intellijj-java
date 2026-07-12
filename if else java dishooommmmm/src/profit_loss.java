import javax.swing.*;
import java.util.Scanner;

public class profit_loss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost");
        double x = sc.nextDouble();
        System.out.println("enter selling");
        double y = sc.nextDouble();
        if(y-x == 0 ) System.out.println("mo profit no loss");
        else if (y-x >= 0) {
            System.out.println("profit");//System.out.println("profit"+(y_x));
            System.out.println( y-x );



        }
        else; {
            System.out.println("loss");
            System.out.println(y - x);
        }    }
}
//or we can use multiple if statements.