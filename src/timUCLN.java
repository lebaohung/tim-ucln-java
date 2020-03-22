import java.util.Scanner;

public class timUCLN {
    public static void main(String[] args) {
        System.out.println("TIM UOC CHUNG LON NHAT.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co UCLN!");
        } else {
            while (a != b) {
                if (a > b) {
                    a -=b;
                } else {
                    b -=a;
                }
            };
            System.out.println("UCLN: " + a);
        }
    }
}
