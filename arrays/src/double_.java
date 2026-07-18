import java.util.Scanner;

public class double_ {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i=0;i<7;i++){
            arr[i] = sc.nextInt();//for input
        }
        for (int i=0;i<7;i++){//for output
            System.out.print(2*arr[i]+" ");
        }
    }
}
