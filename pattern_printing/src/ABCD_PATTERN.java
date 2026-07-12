import java.util.Scanner;

public class ABCD_PATTERN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n> 26)
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){//can start j<=65
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}
