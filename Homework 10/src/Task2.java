import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 10;
        System.out.println("Input Number:");
        int a = scanner.nextInt();
        int b = a;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
            System.out.print(" " + b);
        }
    }
}
