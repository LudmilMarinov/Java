import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Input Number for A");
        int a =sc.nextInt();

        System.out.println("Input number for B");
        int b =sc.nextInt();

        int valueChange =a;
        a = b;
        b = valueChange;

        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

    }
}
