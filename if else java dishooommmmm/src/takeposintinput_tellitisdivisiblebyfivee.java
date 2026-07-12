import java.util.Scanner;

public class takeposintinput_tellitisdivisiblebyfivee {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        if(a%5==0) System.out.println("it is divisible");
        else System.out.println("it is not divisible by 5");
    }
}
