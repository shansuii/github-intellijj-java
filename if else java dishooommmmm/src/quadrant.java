import java.util.Scanner;

public class quadrant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x : ");
        double x = sc.nextDouble();
        System.out.print("enter y: ");
        double y = sc.nextDouble();

        if (x <0 && y>0) System.out.println("2st quad");
        else if (x <0 && y <0) System.out.println("3rd");
        else if (x >0 && y >0) System.out.println("1st quad");
        else if (x >0 && y<0) System.out.println("4th quad");
        else if (x != 0 -x && y == 0) System.out.println("x axis");
        else if (y !=0 && x==0) System.out.println("y axis");
        else System.out.println("origin");


    }
}
