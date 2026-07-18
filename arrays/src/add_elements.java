import java.util.Scanner;

public class add_elements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter elements:");
        int sum=0;
        for (int i =0;i<n;i++)
        arr[i] = sc.nextInt();

        for (int i=0;i<n;i++){
            sum += arr[i];}
        System.out.println(sum);
    }

}
