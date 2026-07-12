package basics;

import java.util.Scanner;

public class relational_operators {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();
        System.out.println(x == y);//we cant store 0 or 1 in boolean datatype
    }
}