import java.util.Scanner;

public class swap {
    static void swap(int a,int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);

    }
}
