import java.util.Scanner;

public class a_raise_b {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 1;

        if (b == 0) System.out.println("1");
        else {
            while (b != 0) {
                sum = sum * a;
                b--;
            }
            System.out.println(sum);
        }
    }
}//or
//for(int i =1; i<=b;i++)
//sum = sum+a;