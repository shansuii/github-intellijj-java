import java.util.Scanner;

public class AP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int i ;
       //for (i=2; i<=((3*n)-1);i=i+3)
      for  (i=4;i<=(4*n);i=i+4)
        {
            System.out.print(i+ " ");
        }
    }
}
// when diff is 4