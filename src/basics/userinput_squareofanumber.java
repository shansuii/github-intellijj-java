package basics;

import java.util.Scanner;

public class userinput_squareofanumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:");
        double x = sc.nextDouble();
        System.out.println("sq =");
        double sq = x*x;
        System.out.println(sq);
    }
}
