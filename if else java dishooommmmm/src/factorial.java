import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int fact = 1;
        while (n!=0){
            fact = n*fact;

            n--;

        }
        System.out.println(fact);
    }
}
