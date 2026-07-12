import java.util.Scanner;

public class reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;
        int org = n ;
        while ( n!=0){
            rev *=10;
            rev += n%10;
            n= n/10;

        }
        System.out.println(rev);
        int sum = org+ rev;


    System.out.println(sum );}
}
