import java.util.Scanner;

public class takerealnum_check_if_it_is_integer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.:");
        double x = sc.nextDouble();
        int n = (int)x;//explicit type casting.
        if(x-n > 0) {
            System.out.println("not  integer");
        }else;
        System.out.println(" integer");

    }
}
//or we can do x- (int)n == 0.
//or if(n == int(n))