import java.util.Scanner;

public class product_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int product = 1;
        System.out.print("enter elements: ");
        for (int i = 0; i <n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {

            product *= arr[i];
        }
        System.out.println(product);
    }
}
