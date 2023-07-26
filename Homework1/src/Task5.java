import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number for A");
        int a = sc.nextInt();
        System.out.println("Input number for B");
        int b = sc.nextInt();
        System.out.println("Input number for C");
        int c = sc.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a+" "+b+" "+c);
    }
}