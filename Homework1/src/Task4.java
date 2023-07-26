import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number for A");
        int a =sc.nextInt();

        System.out.println("Input number for B");
        int b =sc.nextInt();

        if (a<b){
            System.out.println(a);
            System.out.println(b);
        }else {
            System.out.println(b);
            System.out.println(a);
        }
    }
}
