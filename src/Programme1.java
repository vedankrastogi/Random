import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                b = b + 1;
            } else {
                b = 0;
            }
        }
        if (b == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
