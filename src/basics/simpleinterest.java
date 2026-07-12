package basics;

import java.util.Scanner;

public class simpleinterest {
    static void main()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p:");
        double p = sc.nextDouble();
        System.out.println("enter r:");
        double r = sc.nextDouble();
        System.out.println("enter t:");
        double t = sc.nextDouble();
        double SI = (p*r*t)/100;
        System.out.println("si=");
        System.out.println(SI);

    }
}
