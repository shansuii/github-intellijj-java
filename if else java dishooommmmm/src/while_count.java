import java.util.Scanner;

public class while_count {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n==0) n=9;
        while (n!=0){
            n/=10;
            count++;
        }
       if (n==0) System.out.println(count);
    }
}
// 10 se divide krte rahenge number ko jb tk 0 na ajaye
// 10 se divide krne se jitni baar new number ayega end m zero aane tk number ki digits pata chl jayegi.!