import java.util.Scanner;

public class displayGP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n terms");
        int n = sc.nextInt();

       int a=1,r=2;
       for(int i=1; i<=n;i++)
           System.out.println(a *= r);

    }
}
