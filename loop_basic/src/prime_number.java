import java.util.Scanner;

public class prime_number {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true; //true means prime
        for(int i=1;i<=n;i++){
            if (n%i!=0 ){
                flag = false;
                break;

            }
        }
        if (n==1) System.out.println("nor prime nor composite");
        else if (flag=false) System.out.println("composite");
        else System.out.println("prime");
    }
}
