import java.util.Scanner;

public class triangle_sides {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side1:");
        int x = sc.nextInt();
        System.out.print("enter side2:");
        int y = sc.nextInt();
        System.out.println("enter side 3:");
        int z = sc.nextInt();
        if (x+y>z && y+z>x && z+x>y) System.out.println("yes it can be side of triangle.");
        else System.out.println("no");
    }
}
